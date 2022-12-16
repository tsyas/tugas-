//anastasya sabrina 2602174623
package tugas.forum;

public class ProgramHadiah {
    public static void main(String[] args){
        double totalBelanja = 120.000;
        String hasil = null;

        if (totalBelanja >= 100.000) {
            hasil = "Mendapat HADIAH";
        } else if (totalBelanja <= 100.000) {
            hasil = "belum mencukupi untuk mendapat";
        }
        System.out.println("Saat ini anda " + hasil);
    }
}
