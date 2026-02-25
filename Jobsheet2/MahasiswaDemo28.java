
public class MahasiswaDemo28 {

    public static void main(String[] args) {
        Mahasiswa28 mhs = new Mahasiswa28();
        mhs.nama = "Bismillah";
        mhs.nim = "123456";
        mhs.kelas = "TI-1A";        
        mhs.updateIPK(3.6);
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja : " + mhs.nilaiKinerja());
    }
}