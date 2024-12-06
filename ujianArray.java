import java.util.Scanner;

public class ujianArray   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
            return;
        }

        long[] faktorial = new long[n + 1];
        faktorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            faktorial[i] = faktorial[i - 1] * i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial[n]);
    }
}







