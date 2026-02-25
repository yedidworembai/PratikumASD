public class MahasiswaMain28 {
    public static void main(String[] args) {
        // Proses Instansiasi
        Mahasiswa28 mhs1 = new Mahasiswa28();
        
        // Mengakses dan mengisi atribut
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        // Memanggil method
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
    }
}