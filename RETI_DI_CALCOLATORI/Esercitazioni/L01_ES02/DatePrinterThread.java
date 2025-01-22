public class DatePrinterThread extends Thread {
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
        DatePrinterThread t1 = new DatePrinterThread();
        DatePrinterThread t2 = new DatePrinterThread();
        t1.start();
        t2.start();
    }

}
