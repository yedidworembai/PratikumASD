package Praktikum06;

import java.util.Scanner;

public class DosenMain28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen28 list = new DataDosen28();
        int pilih;

        do {
            System.out.println("\n========= MENU DOSEN =========");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda - Bubble)");
            System.out.println("4. Sorting DSC (Usia Tertua - Selection)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1: 
                    System.out.print("Kode Dosen    : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (P/W): ");
                    boolean jk = sc.nextLine().equalsIgnoreCase("P");
                    System.out.print("Usia          : ");
                    int us = sc.nextInt();
                    list.tambah(new Dosen28(kd, nm, jk, us));
                    break;

                case 2: 
                    System.out.println("\n--- Daftar Seluruh Dosen ---");
                    list.tampil();
                    break;

                case 3: 
                    list.sortingASC();
                    System.out.println("\nData Berhasil Diurutkan (Termuda -> Tertua)");
                    list.tampil();
                    break;

                case 4: 
                    list.sortingDSC();
                    System.out.println("\nData Berhasil Diurutkan (Tertua -> Termuda)");
                    list.tampil();
                    break;
            }
        } while (pilih != 5);
        System.out.println("Program Selesai.");
        sc.close();
    }
}
