package Lezione_2.ES02_Callable;

import java.util.concurrent.Callable;

public class Power implements Callable<Long> {

    int base;
    int potenza;

    public Power(int base, int potenza) {
        this.base = base;
        this.potenza = potenza;
    }

    @Override
    public Long call() throws Exception {
        System.out.println(String.format("Calcolo\t\t%d^%d \t-\t %s ", this.base, this.potenza, Thread.currentThread().getName()));
        return (long)Math.pow(this.base, this.potenza);
    }

}
