
import java.util.Scanner;

public class Triangle20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga normal
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n) {
            int j = 0;
            while (j < n - i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
