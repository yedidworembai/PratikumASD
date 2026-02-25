import java.util.Scanner;

public class InputNim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        // ambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // jika kurang dari 10 tambah 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("#");
            } 
            else if (i % 2 == 0) {
                System.out.print(i);
            } 
            else {
                System.out.print("*");
            }
        }

        System.out.println();
        scanner.close();
    }
}