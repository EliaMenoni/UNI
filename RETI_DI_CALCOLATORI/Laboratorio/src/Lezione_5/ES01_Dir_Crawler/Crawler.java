package Lezione_5.ES01_Dir_Crawler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Crawler {
    String path;
    String file_list;
    String dir_list;

    public Crawler(String path) {
        this.path = path;
        this.file_list = "/workspace/UNI/RETI_DI_CALCOLATORI/Laboratorio/src/Lezione_5/ES01_Dir_Crawler/file_list.txt";
        this.dir_list = "/workspace/UNI/RETI_DI_CALCOLATORI/Laboratorio/src/Lezione_5/ES01_Dir_Crawler/dir_list.txt";
    }

    public void tree() {
        try {
            Files.walk(Paths.get(this.path)).forEach(
                    prc -> {
                        System.out.println(prc);
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save_data() {
        FileWriter file;
        FileWriter dir;

        try {
            file = new FileWriter(this.file_list);
            dir = new FileWriter(this.dir_list);

            Files.walk(Paths.get(this.path)).forEach(
                    prc -> {
                        File current = new File(prc.toString());
                        System.out.println(prc);
                        if (current.isFile()) {
                            try {
                                file.write(prc + "\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                dir.write(prc + "\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

            file.close();
            dir.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
