package Lezione_3.ES01_Lock_ReadLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockCounter {
    int count = 0;
    ReadWriteLock lock;

    public ReadLockCounter() {
        this.lock = new ReentrantReadWriteLock();
    }

    public void increment() {
        this.lock.writeLock().lock();
        this.count++;
        this.lock.writeLock().unlock();
    }

    public void get() {
        this.lock.readLock().lock();
        System.out.println(String.format("Valore: %d", this.count));
        this.lock.readLock().unlock();
    }
}
