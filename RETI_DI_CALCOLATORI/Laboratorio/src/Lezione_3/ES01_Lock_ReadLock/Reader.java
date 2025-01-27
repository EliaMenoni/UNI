package Lezione_3.ES01_Lock_ReadLock;

public class Reader implements Runnable{
    private LockCounter counter;

    public Reader(LockCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        this.counter.get();
    }
}
