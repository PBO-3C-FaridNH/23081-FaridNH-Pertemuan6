package pertemuan8.code1;

import java.util.Scanner;

public class GanjilGenapPrima {
    // Method to find odd numbers and their sum
    public static int Ganjil(int rangeAwal, int rangeAkhir, int[] sum) {
        sum[0] = 0;
        for (int i = rangeAwal; i <= rangeAkhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum[0] += i; // Sum of odd numbers
            }
        }
        return sum[0];
    }

    // Method to find even numbers and their sum
    public static int Genap(int rangeAwal, int rangeAkhir, int[] sum) {
        sum[0] = 0;
        for (int i = rangeAwal; i <= rangeAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum[0] += i; // Sum of even numbers
            }
        }
        return sum[0];
    }

    // Method to find prime numbers and their sum
    public static int Prima(int range) {
        int sum = 0;
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                sum += i; // Sum of prime numbers
            }
        }
        return sum;
    }

    // Method to find factors of a number
    public static void Faktor(int number) {
        System.out.print("Factors: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int A, B;
            int[] sum = new int[1];

            System.out.println("\n\t\t\t| Program Deret Bilangan Ganjil Genap |\n");
            System.out.print("Masukkan Range awal: ");
            A = input.nextInt();
            System.out.print("Masukkan Range akhir: ");
            B = input.nextInt();

            System.out.println("\nDeret Bilangan Ganjil: ");
            Ganjil(A, B, sum);
            System.out.println("\nLalu Hasil Jumlahnya: " + sum[0]);
            System.out.print("Dan Faktor dari " + sum[0] + " adalah: ");
            Faktor(sum[0]);

            System.out.println("\nDeret Bilangan Genap: ");
            Genap(A, B, sum);
            System.out.println("\nLalu Hasil Jumlahnya: " + sum[0]);
            System.out.print("Dan Faktor dari " + sum[0] + " adalah: ");
            Faktor(sum[0]);

            System.out.println("\n\t\t\t| Program Deret Bilangan Prima |\n");
            System.out.print("Masukkan Range: ");
            A = input.nextInt();

            System.out.println("\nDeret Bilangan Prima: ");
            int sumPrime = Prima(A);
            System.out.println("\nLalu Hasil Jumlahnya: " + sumPrime);
            System.out.print("Dan Faktor dari " + sumPrime + " adalah: ");
            Faktor(sumPrime);
        }
    }
}
