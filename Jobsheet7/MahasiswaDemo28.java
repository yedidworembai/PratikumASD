package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi28 list = new MahasiswaBerprestasi28(jumMhs);

        // input data
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            list.tambah(new Mahasiswa28(nim, nama, kelas, ipk));
        }

        list.tampil();

        // sequential search
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data Sequential");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan IPK: ");
        double cari = Double.parseDouble(sc.nextLine());

        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // sorting sebelum binary search
        list.bubbleSort();

        // binary search
        System.out.println("----------------------------------");
        System.out.println("Pencarian data Binary");
        System.out.println("----------------------------------");

        System.out.print("Masukkan IPK: ");
        double cari2 = Double.parseDouble(sc.nextLine());

        int pss2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    sc.close();
    }
}