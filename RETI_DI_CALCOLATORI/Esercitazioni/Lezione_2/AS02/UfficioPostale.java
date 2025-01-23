package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_2.AS02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class UfficioPostale {
    public static void main(String[] args) {
        int n_sportelli = 4;
        int max_coda_sportelli = 5;
        int persone_iniziali = 50;

        @SuppressWarnings({ "rawtypes", "unchecked" })
        ExecutorService ufficio = new ThreadPoolExecutor(n_sportelli, n_sportelli, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(max_coda_sportelli * n_sportelli));

        Queue<Operazione> sala_attesa = new LinkedList<Operazione>();
        for (int i = 0; i < persone_iniziali; i++) sala_attesa.add(new Operazione(i));

        Operazione next;
        while ((next = sala_attesa.peek()) != null) {
            try {
                ufficio.submit(next);
                sala_attesa.poll();
            } catch (Exception e) {}
        }
        ufficio.shutdown();
    }
}
