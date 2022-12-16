package tugas.tugaskelompok;
// anastasya sabrina - 2602174623
// kanisa anjani santoso - 2602199304
//SWJudSBSaXpxaWEgUmFtYWRhbg

import java.util.Scanner;

public class TK2 {

    static Scanner input = new Scanner(System.in);

    public static void DeretBilangan() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.print("Masukan sembarang angka [5-20] : ");
        Integer angka = Integer.valueOf(input.nextLine());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("Deret Bilangan");
        System.out.println("#############");
        int jml = 1;

        // Deret bilangan genap
        System.out.println(angka + " Deret bilangan genap:");
        double genap = 0;
        for (int i = 2; jml <= angka; i += 2) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                genap += i;
                jml++;
            }
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan genap = " + genap);
        System.out.println(" ");
        int jmlGanjil = 1;

        // Deret bilangan ganjil
        System.out.println(angka + " Deret bilangan ganjil:");
        double ganjil = 0;
        for (int i = 1; jmlGanjil <= angka; i += 2) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                ganjil += i;
                jmlGanjil++;
            }
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan = " + ganjil);
        System.out.println(" ");

        // Deret bilangan Fibonacci
        System.out.println(angka + " Deret bilangan Fibonacci:");
        double fibonacci = 1;
        int a = 0, b = 1, c;
        System.out.print(b + " ");
        for (int i = 2; i <= angka; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            fibonacci += c;
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan = " + fibonacci);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Masukan Nama Anda (1-25) : ");
        String nama = input.nextLine();
        if (nama.trim().length() == 0) {
            System.out.println("Nama harus memiliki setidaknya 1 karakter");
            return;
        }
        if (nama.trim().length() > 25) {
            System.out.println("Nama tidak boleh memiliki lebih dari 25 karakter");
            return;
        }

        System.out.print("Masukan NIM Anda (harus 10 character) : ");
        String nim = input.nextLine();
        if (nim.trim().length() < 10) {
            System.out.println("NIM harus memiliki 10 karakter");
            return;
        }
        if (nim.trim().length() > 10) {
            System.out.println("NIM tidak boleh memiliki lebih dari 10 karakter");
            return;
        }
        System.out.println(" ");
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\nRegistrasi Sukses..");
        System.out.println("Selamat datang " + nama + "  [NIM : " + nim + "].. ^-^");
        System.out.println(" ");
        System.out.println("Mari belajar deret bilangan..");
        String u = "y";
        while (true) {
            if (!u.trim().toLowerCase().equals("y"))
                break;
            DeretBilangan();
            System.out.println("Anda ingin mengulang? [y/t]");
            u = input.nextLine();
        }
    }
}
