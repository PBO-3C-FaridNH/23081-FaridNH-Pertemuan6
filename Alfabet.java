package pertemuan8.code1;

public class Alfabet {
    public static void main(String[] args) {
        System.out.println("Huruf A sampai Z:");
        for (char Huruf = 'A'; Huruf <= 'Z'; Huruf++) {
            System.out.print(Huruf + " ");
        }

        System.out.println("\n");

        System.out.println("Huruf Z sampai A:");
        for (char Huruf = 'Z'; Huruf >= 'A'; Huruf--) {
            System.out.print(Huruf + " ");
        }

        System.out.println();
    }
}
