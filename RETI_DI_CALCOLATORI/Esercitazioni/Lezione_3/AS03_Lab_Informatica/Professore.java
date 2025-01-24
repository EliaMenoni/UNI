package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.AS03_Lab_Informatica;


public class Professore implements Runnable {
    Postazione[] laboratorio;

    public Professore(Postazione[] laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(3);
        for (Postazione postazione : laboratorio) {
            postazione.login();
        }
        try {
            Thread.sleep((long) Math.floor(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for (Postazione postazione : laboratorio) {
            postazione.logout();
        }

        System.out.println(String.format("Il Professore %s (priorità %d) ha finito con il laboratorio.", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
    }
    
}
