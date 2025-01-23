package RETI_DI_CALCOLATORI.Esercitazioni.Lezione_2.ES01_Threadpool;

public class Viaggiatore implements Runnable {
    int attesa;
    
    public Viaggiatore(int attesa) {
        this.attesa = attesa;
    }

    @Override
    public void run() {
        System.out.println("Vaiggiatore " + Thread.currentThread().getName() + " sta acquistando un bliglietto");
        Thread.sleep(attesa);
        System.out.println("Vaiggiatore " + Thread.currentThread().getName() + " ha acquistato un bliglietto");
    }
    
}
