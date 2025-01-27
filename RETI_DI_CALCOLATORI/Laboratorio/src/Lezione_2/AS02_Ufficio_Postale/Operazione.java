package Lezione_2.AS02_Ufficio_Postale;

public class Operazione implements Runnable {
    int id;
    public Operazione(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) Math.floor(Math.random()*2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Cliente %d ha finito le sue operazioni", this.id));
    }
}
