import java.util.Random;
import java.util.Scanner;

public class ujianSedang3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char operator;
        int bilangan1, bilangan2, jawabanBenar, jawabanUser;
        boolean lanjut = true;

        while (lanjut) {

            bilangan1 = random.nextInt(15);
            bilangan2 = random.nextInt(15);
            int operatorInt = random.nextInt(3);
            if (operatorInt == 0) {
                operator = '*';
            } else if (operatorInt == 1) {
                operator = '/';
                while (bilangan2 == 0) {
                    bilangan2 = random.nextInt(10) + 1;
                }
            } else {
                operator = '%';
            }

            if (operator == '*') {
                jawabanBenar = bilangan1 * bilangan2;
            } else if (operator == '/') {
                jawabanBenar = bilangan1 / bilangan2;
            } else {
                jawabanBenar = bilangan1 % bilangan2;
            }

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            jawabanUser = scanner.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Ingin melanjutkan? (1. yes / 2. no): ");
            int pilihan = scanner.nextInt();
            if (pilihan == 2) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah bermain!");
    }
}
