import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    System.out.print("Masukkan operator pertama\t: ");
    double numOne = scan.nextDouble();

    System.out.print("Masukkan operator kedua\t\t: ");
    double numTwo = scan.nextDouble();

    double tambah = numOne + numTwo;
    double kurang = numOne - numTwo;
    double kali = numOne * numTwo;
    double bagi = numOne / numTwo;

    System.out.println("\nHasil penjumlahan\t: " + df.format(tambah));
    System.out.println("Hasil pengurangan\t: " + df.format(kurang));
    System.out.println("Hasil perkalian\t\t: " + df.format(kali));
    System.out.println("Hasil pembagian\t\t: " + df.format(bagi));

    scan.close();
  }
}
