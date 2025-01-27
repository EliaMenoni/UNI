package Lezione_4.ES01_DropBox;

public class Runner {
    public static void main(String[] args) {
        Dropbox box = new NewDropbox();

        Thread pari = new Thread(new Consumer(box, true));
        Thread dispari = new Thread(new Consumer(box, false));
        Thread produttore = new Thread(new Producer(box));

        produttore.start();
        pari.start();
        dispari.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        produttore.interrupt();
        pari.interrupt();
        dispari.interrupt();
    }
}
