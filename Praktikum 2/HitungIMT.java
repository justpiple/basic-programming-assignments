import java.text.DecimalFormat;
import java.util.Scanner;

public class HitungIMT {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Masukkan berat badan (kg): ");
    double b = input.nextDouble();
    System.out.print("Masukkan tinggi badan (m): ");
    double t = input.nextDouble();

    double imt = b / (t * t);

    String kriteria;
    if (imt <= 18.5) {
      kriteria = "Kurus";
    } else if (imt <= 25) {
      kriteria = "Nromal";
    } else if (imt <= 30) {
      kriteria = "Gemuk";
    } else {
      kriteria = "Kegemukan";
    }

    System.out.println("IMT = " + df.format(imt));
    System.out.println("Termasuk " + kriteria);

    input.close();
  }
}
