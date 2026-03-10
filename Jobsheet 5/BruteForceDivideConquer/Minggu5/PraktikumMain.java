package BruteForceDivideConquer.Minggu5;
public class PraktikumMain {
    public static void main(String[] args) {
        
        Praktikum p = new Praktikum();

        
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        int n = nilaiUTS.length;

       
        int utsTertinggi = p.cariMaxDC(nilaiUTS, 0, n - 1);
        int utsTerendah = p.cariMinDC(nilaiUTS, 0, n - 1);
        double rataRataUAS = p.hitungRataRataBF(nilaiUAS);

      
        System.out.println("=== Hasil Latihan Praktikum 4.5 ===");
        System.out.println("a) Nilai UTS tertinggi (Divide & Conquer) : " + utsTertinggi);
        System.out.println("b) Nilai UTS terendah  (Divide & Conquer) : " + utsTerendah);
        System.out.println("c) Rata-rata nilai UAS (Brute Force)      : " + rataRataUAS);
    }
}