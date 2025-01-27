package Lezione_3.ES01_Lock_ReadLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Manager {
    public static void main(String[] args) {
        LockCounter counter_lock = new LockCounter();
        long startTime_lock = System.currentTimeMillis();
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executor.execute(new Writer(counter_lock));
            executor.execute(new Reader(counter_lock));
        }
        executor.shutdown();
        long endTime_lock = System.currentTimeMillis();

        LockCounter counter_readlock = new LockCounter();
        long startTime_readlock = System.currentTimeMillis();
        executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executor.execute(new Writer(counter_readlock));
            executor.execute(new Reader(counter_readlock));
        }
        executor.shutdown();
        long endTime_readlock = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tempo impiegato con Lock: " + (endTime_lock - startTime_lock));
        System.out.println("Tempo impiegato con ReadLock: " + (endTime_readlock - startTime_readlock));
        System.out.println("Differenza temporale: " + Math.abs((endTime_lock - startTime_lock) - (endTime_readlock - startTime_readlock)));
    }
}
