import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jarakMinimum = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volumeMinimum = 100;

        System.out.println("Masukkan berat paket: ");
        int berat = input.nextInt();
        System.out.println("masukkan jarak tempuh: ");
        int jarakTempuh = input.nextInt();
        System.out.println("Masukkan tinggi barang: ");
        int t = input.nextInt();
        System.out.println("masukkan lebar barang: ");
        int l = input.nextInt();
        System.out.println("Masukkan panjang barang: ");
        int p = input.nextInt();

        int resultVolume = p * l * t;

        if (jarakTempuh <= jarakMinimum) {
            int result1 = harga1 * berat;
            if (resultVolume > volumeMinimum) {
                int finalResult = result1 + harga1;
                System.out.println("biaya yang harus dibayar: " + finalResult);
            } else {
                System.out.println("biaya yang harus dibayar: " + result1);
            }
        } else if (jarakTempuh > jarakMinimum) {
            int result2 = harga2 * berat;
            if (resultVolume > volumeMinimum) {
                int finalResult = result2 + harga3;
                System.out.println("biaya yang harus dibayar: " + finalResult);
            } else {
                System.out.println("biaya yang harus dibayar: " + result2);
            }
        }

}
}