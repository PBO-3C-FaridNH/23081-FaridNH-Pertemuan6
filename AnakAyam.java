package pertemuan8.code1;

import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah anak ayam (N): ");
            int N = input.nextInt();
            
            for (int i = N; i > 0; i--) {
                System.out.println("Anak Ayam turunlah " + i);
                if (i == 1) {
                    System.out.println("Mati 1 tinggallah induknya.");
                } else {
                    System.out.println("Mati 1 tinggallah " + (i - 1));
                }
            }
        }
    }
}
