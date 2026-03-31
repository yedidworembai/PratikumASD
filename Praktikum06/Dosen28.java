package Praktikum06;

public class Dosen28 {

    String kode, nama;
    boolean jenisKelamin; // true: Pria, false: Wanita
    int usia;

    Dosen28(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Pria" : "Wanita";
        System.out.println("Kode: " + kode + " | Nama: " + nama +
                " | JK: " + jk + " | Usia: " + usia);
    }
}
