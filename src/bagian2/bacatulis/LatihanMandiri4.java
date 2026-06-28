package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiri4 {
    public static void main(String[] args) {

        try {
            FileWriter tulis = new FileWriter("hari.txt");

            tulis.write("Senin\n");
            tulis.write("Selasa\n");
            tulis.write("Rabu\n");
            tulis.write("Kamis\n");
            tulis.write("Jumat\n");

            tulis.close();

            System.out.println("Isi berkas hari.txt:");

            BufferedReader baca = new BufferedReader(new FileReader("hari.txt"));
            String baris;

            while ((baris = baca.readLine()) != null) {
                System.out.println(baris);
            }

            baca.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}