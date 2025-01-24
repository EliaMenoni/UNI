package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.AS03_Lab_Informatica;

public class Studente implements Runnable {
    Postazione[] laboratorio;

    public Studente(Postazione[] laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(1);
        int postazione = (int) Math.random()*100%this.laboratorio.length;
        this.laboratorio[postazione].login();

        try {
            Thread.sleep((long) Math.floor(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.laboratorio[postazione].logout();

        System.out.println(String.format("Lo Studente %s (priorità %d) ha finito con il laboratorio.", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
    } 
}
