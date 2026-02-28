package Jobsheet3;

import java.util.Scanner; // Mengimport class Scanner untuk input user

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek scanner
        Mahasiswa28[] arrayOfMahasiswa28 = new Mahasiswa28[3];
        String dummy; // Digunakan untuk membantu proses input float

        // Proses Input Data menggunakan Looping
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa28[i] = new Mahasiswa28(); 
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa28[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa28[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa28[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa28[i].ipk = Float.parseFloat(dummy); 
            System.out.println("--------------------------------------");
        }

      for (int i = 0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    arrayOfMahasiswa28[i].cetakInfo(); 
    System.out.println("--------------------------------------");
}
sc.close(); 
    }
}