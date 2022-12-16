//anastasya sabrina 2602174623
package tugas.forum;

import java.util.Scanner;

public class IfElsekkm70 {
    public static void main(String[] args){
        int nilaiUjian = 80;
        String hasil = null;

        if (nilaiUjian >= 70) {
            hasil = "Lulus";
        } else if (nilaiUjian <= 70) {
            hasil = "Gagal";
        }
        System.out.println("Hasil ujian anda " + hasil);
    }

}
