import java.util.Scanner;
public class soalSulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah elemen dalam array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] frekuensi = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            frekuensi[i] = -1; 
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frekuensi[j] = 0; 
                }
            }
            if (frekuensi[i] != 0) {
                frekuensi[i] = count;
            }
        }

        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < n; i++) {
            if (frekuensi[i] != 0) {
                System.out.println(array[i] + " muncul " + frekuensi[i] + " kali");
            }
}
}
}
