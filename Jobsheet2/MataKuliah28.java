public class MataKuliah28 {

   // Atribut kelas MataKuliah
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

   // Constructor default
    public MataKuliah28() {
        kodeMK = "";
        nama = "";
        sks = 0;
        jumlahJam = 0;
    }

   // Constructor berparameter
    public MataKuliah28(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("---------------------------");
    }

   // Method untuk mengubah SKS
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    // Method untuk menambah jumlah jam
    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    // Method untuk mengurangi jumlah jam
    public void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jam tidak mencukupi.");
        }
    }
}