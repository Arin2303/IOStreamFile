package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri6 {
    public static void main(String[] args) {

        int jumlahBaris = 0;

        try {
            BufferedReader baca = new BufferedReader(new FileReader("hari.txt"));
            String baris;

            while ((baris = baca.readLine()) != null) {
                jumlahBaris++;
            }

            baca.close();

            System.out.println("Jumlah baris dalam hari.txt = " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}