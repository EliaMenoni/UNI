package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.ES01_Lock_ReadLock;

public class Writer implements Runnable {
    LockCounter counter;

    public Writer(LockCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        this.counter.increment();
    }

}
