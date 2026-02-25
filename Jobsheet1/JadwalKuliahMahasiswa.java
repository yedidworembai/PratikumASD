<<<<<<< HEAD

import java.util.Scanner;
public class JadwalKuliahMahasiswa {
    static Scanner sc = new Scanner(System.in);


    public static String[][] inputJadwal(int n) {
        String[][] jadwal = new String[n][4]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Input jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
        return jadwal;      
    }

    
    public static void tampilkanSemua(String[][] jadwal) {
        System.out.println("==============================================");
        System.out.printf("%-25s %-20s %-10s %-10s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================");
        for (String[] baris : jadwal) {
            System.out.printf("%-25s %-20s %-10s %-10s\n", 
                              baris[0], baris[1], baris[2], baris[3]);
        }
        System.out.println("==============================================");
    }

    
    public static void tampilkanByHari(String[][] jadwal, String hari) {
        System.out.println("\nJadwal kuliah pada hari " + hari + ":");
        for (String[] baris : jadwal) {
            if (baris[2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-20s %-10s %-10s\n", 
                                  baris[0], baris[1], baris[2], baris[3]);
            }
        }
    }

    
    public static void tampilkanByMatkul(String[][] jadwal, String matkul) {
        System.out.println("\nJadwal kuliah untuk mata kuliah " + matkul + ":");
        for (String[] baris : jadwal) {
            if (baris[0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-25s %-20s %-10s %-10s\n", 
                                  baris[0], baris[1], baris[2], baris[3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = inputJadwal(n);

        tampilkanSemua(jadwal);

        
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilkanByHari(jadwal, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilkanByMatkul(jadwal, matkul);
    }
}
=======

import java.util.Scanner;
public class JadwalKuliahMahasiswa {
    static Scanner sc = new Scanner(System.in);


    public static String[][] inputJadwal(int n) {
        String[][] jadwal = new String[n][4]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Input jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
        return jadwal;      
    }

    
    public static void tampilkanSemua(String[][] jadwal) {
        System.out.println("==============================================");
        System.out.printf("%-25s %-20s %-10s %-10s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================");
        for (String[] baris : jadwal) {
            System.out.printf("%-25s %-20s %-10s %-10s\n", 
                              baris[0], baris[1], baris[2], baris[3]);
        }
        System.out.println("==============================================");
    }

    
    public static void tampilkanByHari(String[][] jadwal, String hari) {
        System.out.println("\nJadwal kuliah pada hari " + hari + ":");
        for (String[] baris : jadwal) {
            if (baris[2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-20s %-10s %-10s\n", 
                                  baris[0], baris[1], baris[2], baris[3]);
            }
        }
    }

    
    public static void tampilkanByMatkul(String[][] jadwal, String matkul) {
        System.out.println("\nJadwal kuliah untuk mata kuliah " + matkul + ":");
        for (String[] baris : jadwal) {
            if (baris[0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-25s %-20s %-10s %-10s\n", 
                                  baris[0], baris[1], baris[2], baris[3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = inputJadwal(n);

        tampilkanSemua(jadwal);

        
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilkanByHari(jadwal, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilkanByMatkul(jadwal, matkul);
    }
}
>>>>>>> c436fdae7691ece20bcb0c2c76f3002b23586351
