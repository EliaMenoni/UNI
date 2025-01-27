package Lezione_2.ES01_Threadpool;

public class Viaggiatore implements Runnable {
    int attesa;
    int id;
        
    public Viaggiatore(int id, int attesa) {
        this.id = id;
        this.attesa = attesa;
    }

    @Override
    public void run() {
        System.out.println("Vaiggiatore " + this.id + " sta acquistando un bliglietto");
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Vaiggiatore " + this.id + " ha acquistato un bliglietto");
    }
    
}
