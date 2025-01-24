package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.AS03_Lab_Informatica;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Tutor {
    public static void main(String[] args) {
        int num_persone = 30;
        Postazione[] laboratorio = new Postazione[20];
        for (int i = 0; i < laboratorio.length; i++) {
            laboratorio[i] = new Postazione(i + 1);
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < num_persone; i++) {
            executor.execute(new Professore(laboratorio));
            executor.execute(new Tesista(laboratorio, i % 20));
            executor.execute(new Studente(laboratorio));
        }
        executor.shutdown();
    }
}
