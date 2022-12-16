package tugas.forum;
// anastasya sabrina 2602174623
import java.util.Scanner;
public class poundtokilogram {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number in pounds: ");
            double pounds = input.nextDouble();
            double kilograms = poundsToKilograms(pounds);
            System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        }
        private static double poundsToKilograms(double pounds) {
            return pounds * 0.454;
        }

}
