package tugas.tugaskelompok;
import java.util.Scanner;
public class restoranBUNGAR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pesanan untuk berapa orang : ");
        Integer jumlahOrang = Integer.valueOf(input.nextLine());
        System.out.print("Pesanan atas nama : ");
        String atasNama = input.nextLine();

        System.out.println("\nMenu Special hari ini");
        System.out.println("##########################");
        System.out.println("Nasi Goreng Spesial");
        System.out.println("Ayam Goreng Spesial");
        System.out.println("Steak Sirloin Spesial");
        System.out.println("Kwetiaw Siram Spesial");
        System.out.println("Kambing Guling Spesial");

        System.out.println("\nPesanan Anda (batas pesana 1-10)");


        System.out.print("Nasi Goreng Spesial    : ");
        Integer nasiGorengS = (Integer.valueOf(input.nextLine()) > 10 ? 10 : Integer.valueOf(input.nextLine()));
        Double hrgNasiGorengS = 9999.99;
        Double jmlhNGS = hrgNasiGorengS * nasiGorengS;


        System.out.print("Ayam Goreng Spesial    : ");
        Integer ayamGorengS = (Integer.valueOf(input.nextLine()) > 10 ? 10 : Integer.valueOf(input.nextLine()));
        Double hrgAyamGorengS = 12345.67;
        Double jmlhAGS = hrgAyamGorengS * ayamGorengS;

        System.out.print("Steak Sirloin Spesial  : ");
        Integer steakSirloinS = (Integer.valueOf(input.nextLine()) > 10 ? 10 : Integer.valueOf(input.nextLine()));
        Double hrgSteakSirloinS = 21108.40;
        Double jmlhSSS = hrgSteakSirloinS * steakSirloinS;

        System.out.print("Kwetiaw Siram Spesial  : ");
        Integer kwetiawSiramS = (Integer.valueOf(input.nextLine()) > 10 ? 10 : Integer.valueOf(input.nextLine()));
        Double hrgKwetiawSiramS = 13579.13;
        Double jmlhKSS = hrgKwetiawSiramS * kwetiawSiramS;

        System.out.print("Kambing Guling Spesial : ");
        Integer kambingGulingS = (Integer.valueOf(input.nextLine()) > 10 ? 10 : Integer.valueOf(input.nextLine()));
        Double hrgKambingGulingS = 98765.43;
        Double jmlhKGS = hrgKambingGulingS * kambingGulingS;


        System.out.println("\nSelamat menikmati makanan anda");
        System.out.println("Pembelian :");
        System.out.println("Nasi Goreng Spesial" +"    " +  nasiGorengS    + "  porsi * " +"  "+ "RP." + hrgNasiGorengS    + "     " + "= Rp."+ String.format("%.2f",jmlhNGS));
        System.out.println("Ayam Goreng Spesial" +"    " +  ayamGorengS    + "  porsi * " +"  "+ "RP." + hrgAyamGorengS    + "    " + "= Rp."+ String.format("%.2f",jmlhAGS));
        System.out.println("Steak Sirloin Spesial" +"  " +  steakSirloinS  + "  porsi * " +"  "+ "RP." + hrgSteakSirloinS  + "     " + "= Rp."+ String.format("%.2f",jmlhSSS));
        System.out.println("kwetiaw Siram Spesial" +"  " +  kwetiawSiramS  + "  porsi * " +"  "+ "RP." + hrgKwetiawSiramS  + "    " + "= Rp."+ String.format("%.2f",jmlhKSS));
        System.out.println("Kambing Guling Spesial" +" " +  kambingGulingS + "  porsi * " +"  "+ "RP." + hrgKambingGulingS + "    " + "= Rp."+ String.format("%.2f",jmlhKGS));
        System.out.println("#######################################################################");
        Double total =  jmlhNGS + jmlhAGS + jmlhSSS + jmlhKSS + jmlhKGS;
        Double disc = total * 0.1;
        Double totalbayar = total - disc;
        Double totalperorg = totalbayar/8;
        System.out.println("Total Pembelian          = Rp. " +  total);
        System.out.println("Disc. 10% <Masa Promosi> = Rp." + disc );
        System.out.println("#######################################################################");
        System.out.println("Total Pembelian disc 10% " + String.format("%.2f",totalbayar));
        System.out.println("Total bayar per orang Rp." + String.format("%.2f",totalperorg));
        System.out.println("\nTerima kasih atas kunjungan Anda...");
        System.out.println("\n...tekan ENTER untuk keluar...");
    }

}
