package QuizPraktikum;
import java.util.Scanner;

public class RestoDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah restoran: ");
        int jumlahElt = Integer.parseInt(sc.nextLine());
        Resto28[] arrayOfResto28 = new Resto28[jumlahElt];  

        for (int i = 0; i < jumlahElt; i++) {
            System.out.println("Masukkan Data Restoran ke-" + (i + 1));
            arrayOfResto28[i] = new Resto28();
            arrayOfResto28[i].tambahdata(sc); 
            arrayOfResto28[i].cetakInfo();
        }
        System.out.println("\n======= HASIL INPUT RESTORAN =======");
        for (int i = 0; i < jumlahElt; i++) {
            System.out.println("Data Restoran ke-" + (i + 1));
            arrayOfResto28[i].cetakInfo(); 
        }
}
}