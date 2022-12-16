//anastasya sabrina-2602174623-tbba
package tugas.tugaspersonal.stockGudang;
import java.util.Scanner;

public class Main {

    static Scanner inputan = new Scanner(System.in);
    public static void main(String [] args) {
        System.out.print("Masukan nama anda :");
        String namaAnda = inputan.nextLine();
        System.out.println("");
        System.out.println("#################");
        System.out.print("Masukan nama barang yang mau ditambah :");
        String namaBarang = inputan.nextLine();
        System.out.print("Masukan jumlah barang yang mau ditambah :");
        String jumlahBarang = inputan.nextLine();
        System.out.print("Masukan harga beli untuk barang tersebut :");
        String hargaBeliBarang = inputan.nextLine();
        System.out.print("Masukan harga jual untuk barang tersebut :");
        String hargaJualBarang = inputan.nextLine();
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("#################");
        System.out.println("Nama Barang  :" + namaBarang);
        System.out.println("Jumlah Barang :" + jumlahBarang);
        System.out.println("Harga Beli    :Rp." + hargaBeliBarang);
        System.out.println("Harga jual    :Rp." + hargaJualBarang);

    }
}
