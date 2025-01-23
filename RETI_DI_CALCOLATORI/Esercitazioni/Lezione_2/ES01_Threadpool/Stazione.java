package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_2.ES01_Threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Stazione {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(50));
        for (int i = 0; i < 100; i++) {
            try {
                executor.execute(new Viaggiatore(i, (int)Math.round(Math.random()*1000)));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.out.println("\t\t\tCliente " + i + " non ha trovato posto e lascia la stazione");
            }
        }
        executor.shutdown();
        executor.close();
    }
}
