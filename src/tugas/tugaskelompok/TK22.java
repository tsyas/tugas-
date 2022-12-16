package tugas.tugaskelompok;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TK22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer angka = input.nextInt();
        double genap = 0;
        double totalGenap = 0;
        int a = 0, b = 2;
        for (int i = 1; i <= angka; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            totalGenap += genap;
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan = " + genap);
        System.out.println();
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        List<Integer> evenNumbers = new ArrayList<>();
//        List<Integer> oddNumbers = new ArrayList<>();
//        List<Integer> fibonacciNumbers = new ArrayList<>();
//
//        // Ambil angka-angka genap
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                evenNumbers.add(number);
//            }
//        }
//
//        // Ambil angka-angka ganjil
//        for (int number : numbers) {
//            if (number % 2 != 0) {
//                oddNumbers.add(number);
//            }
//        }
//
//        // Ambil angka-angka fibonacci
//        int a = 0, b = 1, c = 0;
//        fibonacciNumbers.add(a);
//        fibonacciNumbers.add(b);
//
//        while (c < 100) {
//            c = a + b;
//            a = b;
//            b = c;
//
//            if (c < 100) {
//                fibonacciNumbers.add(c);
//            }
        }
}
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            // Meminta input jumlah angka yang ingin ditampilkan untuk setiap deret
//            System.out.print("Masukkan jumlah angka yang ingin ditampilkan: ");
//            int jumlahAngka = input.nextInt();
//
//            // Menampilkan deret bilangan genap
//            System.out.print("Deret bilangan genap: ");
//            int genap = 0;
//            int totalGenap = 0;
//            for (int i = 0; i < jumlahAngka; i++) {
//                genap += 2;
//                System.out.print(genap + " ");
//                totalGenap += genap;
//            }
//            System.out.println("\nTotal penjumlahan: " + totalGenap);
//
//            // Menampilkan deret bilangan ganjil
//            System.out.print("Deret bilangan ganjil: ");
//            int ganjil = 1;
//            int totalGanjil = 0;
//            for (int i = 0; i < jumlahAngka; i++) {
//                System.out.print(ganjil + " ");
//                totalGanjil += ganjil;
//            }
//            System.out.println("\n Total penjumlahan " + totalGenap);
//        }





//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            // Meminta user untuk memasukkan jumlah angka yang ingin ditampilkan
//            System.out.print("Masukkan jumlah angka yang ingin ditampilkan: ");
//            int jumlah = input.nextInt();
//
//            // Menampilkan deret bilangan genap
//            for (int i = 0; i < jumlah; i++) {
//                System.out.print(2 * i + " ");
//            }
//        }


//       for (int i = 2; i <= angka; i += 2) {
//               System.out.print(i + " ");
//               genap += i;

