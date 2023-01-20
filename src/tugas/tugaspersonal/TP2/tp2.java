package tugas.tugaspersonal.TP2;
import java.util.Scanner;
//anastasya sabirna 2602174623


public class tp2 {
    static Scanner input = new Scanner(System.in);
    public static void DAGF(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukan banyak angka yang mau dicetak(2..10) : ");
        int ba = input.nextInt();
        System.out.print("Masukan beda masing masing angka (2..9)      : ");
        int be = input.nextInt();

        //deret aritmatika
        int a = 1;
        System.out.println("Deret Aritmatika dari : ");
        for (int i = 1; i <= ba; i++) {
            System.out.print(a + " ");
            a += be;}
        System.out.println();

        // Deret Geometri
        a = 1;
        System.out.println("Deret Geometri : ");
        for (int i = 1; i <= ba; i++) {
            System.out.print(a + " ");
            a *= be;}
        System.out.println();

        // Faktorial
        int faktorial = 1;
        System.out.println("Faktorial dari : " + ba);
        for (int i = 1; i <= ba; i++) {
            faktorial = faktorial * i;
            if (ba - i != 0) {
                System.out.print(ba - i + " ");

            }
            if (ba != i && ba != i + 1) {

                System.out.print("* ");
            }
        }
        System.out.println("= " + faktorial + "* ");

    }
    public static void main(String[]args) {
        System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
        String u = "y";
        while (true)
        {
            if (!u.trim().toLowerCase().equals("y")) break;
            DAGF();
            System.out.print("Anda mau mengulang? [y/t]");
            u = input.nextLine();
        }

    }
}
