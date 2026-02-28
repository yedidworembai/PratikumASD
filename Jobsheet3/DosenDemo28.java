package Jobsheet3;

import java.util.Scanner;

public class DosenDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jml = Integer.parseInt(sc.nextLine());
        Dosen28[] arrayOfDosen28 = new Dosen28[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            boolean jk = sc.nextLine().equalsIgnoreCase("P");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------");
            
            arrayOfDosen28[i] = new Dosen28(kode, nama, jk, usia);
        }

    
        DataDosen28 dataData = new DataDosen28();
        dataData.dataSemuaDosen(arrayOfDosen28);
        dataData.jumlahDosenPerJenisKelamin(arrayOfDosen28);
        dataData.ratarataUsiaDosenPerJenisKelamin(arrayOfDosen28);
        dataData.infoDosenPalingTua(arrayOfDosen28);
        dataData.infoDosenPalingMuda(arrayOfDosen28);
        
        sc.close();
    }
    
}