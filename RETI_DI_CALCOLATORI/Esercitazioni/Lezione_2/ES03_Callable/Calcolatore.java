package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_2.ES03_Callable;

import java.lang.reflect.Array;
import java.text.Format;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Calcolatore {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int base = 1;
        Future<Long>[] res = new Future[49];
        for (int i = 2; i <= 50; i++) {
            res[i - 2] = pool.submit(new Power(base, i));
        }
        
        Long totale = (long) 0;
        for (Future<Long> potenza : res) {
            try {
                totale += potenza.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Risultato: %d", totale));
        pool.shutdown();
    }
}
