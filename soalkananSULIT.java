import java.util.Scanner;

public class soalkananSULIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        // Validasi jumlah siswa
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0!");
            return;
        }

        // Inisialisasi variabel untuk menyimpan total nilai
        int totalNilai = 0;

        // Input nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            int nilai = scanner.nextInt();

            // Validasi nilai positif
            if (nilai < 0) {
                System.out.println("Nilai tidak boleh negatif. Silakan masukkan ulang nilai.");
                i--; // Ulangi input untuk siswa ini
                continue;
            }

            totalNilai += nilai;
        }

        // Hitung rata-rata
        double rataRata = (double) totalNilai / jumlahSiswa;

        // Cetak hasil
        System.out.println("\nHasil Rekapitulasi:");
        System.out.println("Jumlah nilai: " + totalNilai);
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);

        scanner.close();
    }
}
    

