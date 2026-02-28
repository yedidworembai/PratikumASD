public class MataKuliahMain28 {
    public static void main(String[] args) {

        // Objek menggunakan constructor default
        MataKuliah28 mk1 = new MataKuliah28();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Objek menggunakan constructor berparameter
        MataKuliah28 mk2 = new MataKuliah28("IF102", "Pemrograman Java", 4, 8);

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();

        // Memanggil semua method
        System.out.println("=== Perubahan Data MK1 ===");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\n=== Data MK1 Setelah Perubahan ===");
        mk1.tampilInformasi();
    }
}