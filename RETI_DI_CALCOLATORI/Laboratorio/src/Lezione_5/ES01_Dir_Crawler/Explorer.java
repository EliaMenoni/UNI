package Lezione_5.ES01_Dir_Crawler;

public class Explorer {
    public static void main(String[] args) {
        Crawler craw = new Crawler("./Test/");
        craw.save_data();
    }
}
