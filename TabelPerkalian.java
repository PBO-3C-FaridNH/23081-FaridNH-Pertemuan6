package pertemuan8.code1;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Masukkan nilai n (maksimal 10): ");
            int n = input.nextInt();
            
            if (n > 10 || n < 1) {
                System.out.println("Nilai n harus di antara 1 dan 10.");
            } else {

                System.out.println("Tabel Perkalian " + n + " x " + n + ":");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(i * j + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
