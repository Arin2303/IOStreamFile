package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = {
            "Makanan",
            "Minuman",
            "Peralatan"
        };

        System.out.println("=== KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Beras", 15000, 20));

        gudang.tambahBarang(
                new Barang("Gula", 18000, 15));

        gudang.tambahBarang(
                new Barang("Teh", 8000, 25));

        gudang.tambahBarang(
                new Barang("Kopi", 12000, 30));

        gudang.tambahBarang(
                new Barang("Susu", 10000, 18));

        gudang.tampilkanSemua();

        System.out.println();

        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();

        gudangBaru.tampilkanSemua();

        System.out.println();

        System.out.println(
                "Total Nilai Persediaan = Rp"
                + gudangBaru.totalNilai());
    }
}