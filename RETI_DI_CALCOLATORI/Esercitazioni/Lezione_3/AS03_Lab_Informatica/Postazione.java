package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_3.AS03_Lab_Informatica;

import java.util.concurrent.locks.ReentrantLock;

public class Postazione {
    int ID;
    ReentrantLock lock;

    public Postazione(int ID) {
        this.ID = ID;
        this.lock = new ReentrantLock();
    }

    public boolean login() {
        try {
            this.lock.lock();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean logout() {
        if (!this.lock.isLocked()) return false;
        this.lock.unlock();
        // this.lock.notifyAll();
        return true;
    }
}
