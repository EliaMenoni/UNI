package Lezione_4.ES01_DropBox;

public class Consumer implements Runnable {
    boolean parita;
    Dropbox box;

    public Consumer(Dropbox box, boolean parita) {
        this.parita = parita;
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            if (parita)
                System.out.println(String.format("Ho letto il numero pari: %d", this.box.take(this.parita)));
            else
                System.out.println(String.format("Ho letto il numero dispari: %d", this.box.take(this.parita)));
        }
    }
}
