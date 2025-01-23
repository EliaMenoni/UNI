package RETI_DI_CALCOLATORI.Esercitazioni.L01_AS01;

public class PyThread implements Runnable {
    double soglia;
    double pi;

    public PyThread(double soglia) {
        this.soglia = soglia;
        this.pi = 0;
    }

    public void run() {
        double i = 1;
        System.out.println("Soglia\t\tFrazione Calcolata\tValore PI");
        while (Math.abs(Math.PI - this.pi) >= this.soglia) {            
            this.pi += 4.0/i;

            if (i < 0) {
                System.out.println(this.soglia + "\t\t-4/" + (int)i*-1 + "\t\t\t" + this.pi);
                i -= 2;
            }
            else {
                System.out.println(this.soglia + "\t\t 4/" + (int)i + "\t\t\t" + this.pi);
                i += 2;
            }

            i *= -1;
        }
        System.out.println("Valore calcolato: " + this.pi);
    }
}
