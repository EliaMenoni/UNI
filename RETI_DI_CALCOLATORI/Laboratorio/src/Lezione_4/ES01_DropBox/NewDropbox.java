package Lezione_4.ES01_DropBox;

public class NewDropbox extends Dropbox{

    @Override
    public synchronized void put(int n) {
        while (this.full)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.num = n;
        this.full = true;
        this.notifyAll();
    }

    @Override
    public synchronized int take(boolean e) {
        while (!this.full || e == (this.num % 2 != 0))
            try {
                this.wait();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }

        this.full = false;
        this.notifyAll();
        return this.num;
    }

}
