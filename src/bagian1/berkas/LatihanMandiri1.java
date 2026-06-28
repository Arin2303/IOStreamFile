package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        File file = new File("laporan.txt");

        System.out.println("Nama File : " + file.getName());
        System.out.println("Apakah file ada? " + file.exists());

        if (file.exists()) {
            System.out.println("Ukuran file : " + file.length() + " byte");
        }
    }
}