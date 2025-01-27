package Lezione_1.ES01;

public class DatePrinter {
    public static void main(String[] args) {
        while (true) {
            System.out.print(Thread.currentThread() + "\t" + Thread.currentThread().getName() + "\t");
            System.out.print("Current date and time: ");
            System.out.println(new java.util.Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
