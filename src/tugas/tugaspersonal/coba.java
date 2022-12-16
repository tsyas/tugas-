package tugas.tugaspersonal;
import java.util.Scanner;
public class coba {

        static Scanner input = new Scanner(System.in);
        public static void main(String [] args) {
            System.out.print("Masukan nama anda :");
            String namaanda = input.nextLine();
            System.out.println("");
            System.out.println("#################");
            System.out.print("Masukan nama barang yang mau ditambah :");
            String namabarang = input.nextLine();
            System.out.print("Masukan jumlah barang yang mau ditambah :");
            String jmlhBarang = input.nextLine();
            System.out.print("Masukan harga beli untuk barang tersebut :");
            String hrgbelibarang = input.nextLine();
            System.out.print("Masukan harga jual untuk barang tersebut :");
            String hrgjualbarang = input.nextLine();
            System.out.println("Stok Gudang Rincian Barang");
            System.out.println("###########################");
            System.out.println("Harga Barang  :" + namabarang);
            System.out.println("Jumlah Barang :" + jmlhBarang);
            System.out.println("Harga Beli    :Rp." + hrgbelibarang);
            System.out.println("Harga jual    :Rp." + hrgjualbarang);

        }
    }

