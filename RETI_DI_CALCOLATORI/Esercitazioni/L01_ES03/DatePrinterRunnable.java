public class DatePrinterRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread() + "\t" + Thread.currentThread().getName() + "\tCurrent date and time: " + new java.util.Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DatePrinterRunnable dpr = new DatePrinterRunnable();
        Thread t1 = new Thread(dpr);
        Thread t2 = new Thread(dpr);
        t1.start();
        t2.start();
    }

}
