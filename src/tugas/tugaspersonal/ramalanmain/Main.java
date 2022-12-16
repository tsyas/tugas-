package tugas.tugaspersonal.ramalanmain;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner inputan = new Scanner(System.in);
    static Random randomNum = new Random();

    public static void main(String [] args) {
        System.out.println(" Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("DATA ANDA :");
        System.out.println("♡♡♡♡♡");
        System.out.print("Masukan Nama Anda: " );
        String namaSaya = inputan.nextLine();
        System.out.print("Masukan Umur Anda: ");
        Integer umurSaya = Integer.valueOf(inputan.nextLine());
        System.out.println("");
        System.out.println("DATA PASANGAN ANDA :");
        System.out.println("♡♡♡♡♡♡♡♡♡");
        System.out.print("Masukan Nama Pasangan Anda: " );
        String namaPasanganSaya = inputan.nextLine();
        System.out.print("Masukan Umur Pasangan Anda: ");
        Integer umurPasanganSaya = Integer.valueOf(inputan.nextLine());
        System.out.println("");
        System.out.println("Tekan ENTER untuk melihat hasil ramalan");
        System.out.println("");
        System.out.println(namaSaya + " " + umurSaya);
        System.out.println("");
        System.out.println("  ^,,,,^ ");
        System.out.println(" (̳ • · •̳)");
        System.out.println("  / づ :¨·.·¨:");
        System.out.println("       `·..·‘ ");
        System.out.println("");
        System.out.println(namaPasanganSaya + " "+ umurPasanganSaya);
        System.out.println("");
        Random r = new Random();
        int low = 50;
        int high = 100;
        Float kecocokan = r.nextFloat(high-low) + low;
        System.out.println("kecocokan anda dengan pasangan anda adalah :"+ String.format("%.2f", kecocokan) + "%");
        System.out.println("Terima Kasih karena telah menggunakan jasa ramalan kami..^^");
    }
}
