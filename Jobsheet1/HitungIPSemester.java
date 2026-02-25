import java.util.Scanner;

public class HitungIPSemester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
        double nilaiPancasila = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        double nilaiKTI = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        double nilaiCTPS = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Matematika Dasar: ");
        double nilaiMatDas = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris: ");
        double nilaiBIng = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        double nilaiDasPro = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        double nilaiPrakDasPro = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        double nilaiK3 = scanner.nextDouble();

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("===============================================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        tampilkanNilai("Pancasila", nilaiPancasila);
        tampilkanNilai("Konsep Teknologi Informasi", nilaiKTI);
        tampilkanNilai("Critical Thinking dan Problem Solving", nilaiCTPS);
        tampilkanNilai("Matematika Dasar", nilaiMatDas);
        tampilkanNilai("Bahasa Inggris", nilaiBIng);
        tampilkanNilai("Dasar Pemrograman", nilaiDasPro);
        tampilkanNilai("Praktikum Dasar Pemrograman", nilaiPrakDasPro);
        tampilkanNilai("Keselamatan dan Kesehatan Kerja", nilaiK3);

        scanner.close();
    }

    public static void tampilkanNilai(String mk, double nilaiAngka) {

        String nilaiHuruf;
        double bobotNilai;

        if (nilaiAngka >= 80) {
            nilaiHuruf = "A";
            bobotNilai = 4.00;
        } else if (nilaiAngka >= 75) {
            nilaiHuruf = "B+";
            bobotNilai = 3.50;
        } else if (nilaiAngka >= 70) {
            nilaiHuruf = "B";
            bobotNilai = 3.00;
        } else if (nilaiAngka >= 65) {
            nilaiHuruf = "C+";
            bobotNilai = 2.50;
        } else if (nilaiAngka >= 60) {
            nilaiHuruf = "C";
            bobotNilai = 2.00;
        } else if (nilaiAngka >= 50) {
            nilaiHuruf = "D";
            bobotNilai = 1.00;
        } else {
            nilaiHuruf = "E";
            bobotNilai = 0.00;
        }

        System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",
                mk, nilaiAngka, nilaiHuruf, bobotNilai);
    }
}