package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiri5 {
    public static void main(String[] args) {

        try {
            FileWriter tulis = new FileWriter("hari.txt", true);

            tulis.write("Sabtu\n");
            tulis.write("Minggu\n");

            tulis.close();

            System.out.println("Isi berkas hari.txt setelah ditambahkan:");

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