import java.util.Scanner;

public class NilaiAkhirMahasiswa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // validasi input
        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100 ||
            nilaiTugas < 0 || nilaiKuis < 0 || nilaiUTS < 0 || nilaiUAS < 0) {

            System.out.println("===============================");
            System.out.println("Nilai tidak valid");

        } else {

            double nilaiAkhir =
                    (nilaiTugas * 0.2) +
                    (nilaiKuis * 0.3) +
                    (nilaiUTS * 0.2) +
                    (nilaiUAS * 0.4);

            String nilaiHuruf;
            String status;

            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                status = "LULUS";
            } else {
                nilaiHuruf = "D";
                status = "TIDAK LULUS";
            }

            System.out.println("===============================");
            System.out.printf("Nilai akhir : %.1f%n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println(status);
        }

        scanner.close();
    }
}