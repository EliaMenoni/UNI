package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.ES01_Lock_ReadLock;

import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {
    int count = 0;
    ReentrantLock lock;

    public LockCounter() {
        this.lock = new ReentrantLock();
    }

    public void increment() {
        this.lock.lock();
        this.count++;
        this.lock.unlock();
    }

    public void get() {
        this.lock.lock();
        System.out.println(String.format("Valore: %d", this.count));
        this.lock.unlock();
    }
}
