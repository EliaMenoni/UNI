package Lezione_4.ES01_DropBox;

public class Producer implements Runnable {
    Dropbox box;

    public Producer(Dropbox box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Inserisco nuovo valore casuale");
            this.box.put((int)(Math.random() * 100));
        }
    }
}
