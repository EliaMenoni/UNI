package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.AS03_Lab_Informatica;

public class Tesista implements Runnable {
    Postazione[] laboratorio;
    int id_pc;

    public Tesista(Postazione[] laboratorio, int id_pc) {
        this.laboratorio = laboratorio;
        this.id_pc = id_pc;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(2);
        this.laboratorio[this.id_pc].login();

        try {
            Thread.sleep((long) Math.floor(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.laboratorio[this.id_pc].logout();

        System.out.println(String.format("Il Tesista %s (priorità %d) ha finito con il laboratorio.", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
    }

}
