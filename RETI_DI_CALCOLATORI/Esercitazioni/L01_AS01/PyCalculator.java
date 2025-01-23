package RETI_DI_CALCOLATORI.Esercitazioni.L01_AS01;

public class PyCalculator {
    public static void main(String[] args) {
        double soglia = 0.001;

        // gestione input argomento
        // try {
        //     soglia = new Float(args[1]);
        // } catch (Exception e) {
        //     System.out.println("Valore di soglia mancante");
        //     return;
        // }

        PyThread calcolatore = new PyThread(soglia);
        Thread runner = new Thread(calcolatore);
        runner.start();
    }
}
