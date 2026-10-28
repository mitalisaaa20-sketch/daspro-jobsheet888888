
import java.util.Scanner;

public class Tugas3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int toko = sc.nextInt();

        int totalSeluruhBarang = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int i = 1; i <= toko; i++) {
            System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
            int pelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + " di toko " + i + ": ");
                int barang = sc.nextInt();

                totalBarangToko += barang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarangToko);

            totalSeluruhBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}

