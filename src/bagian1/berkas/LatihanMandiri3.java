package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {

        File file = new File("sementara.txt");

        try {

            file.createNewFile();

            System.out.println("Status sebelum dihapus : " + file.exists());

            if (file.delete()) {
                System.out.println("File berhasil dihapus.");
            } else {
                System.out.println("File gagal dihapus.");
            }

            System.out.println("Status sesudah dihapus : " + file.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}