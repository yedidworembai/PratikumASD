package Jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahElt = Integer.parseInt(sc.nextLine());
        Matakuliah28[] arrayOfMatakuliah28 = new Matakuliah28[jumlahElt];

      
        for (int i = 0; i < jumlahElt; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah28[i] = new Matakuliah28();
            arrayOfMatakuliah28[i].tambahData(sc); 
            System.out.println("--------------------------------------");
        }

       
        System.out.println("\n======= HASIL INPUT MATA KULIAH =======");
        for (int i = 0; i < jumlahElt; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah28[i].cetakInfo(); 
        }
    }
}