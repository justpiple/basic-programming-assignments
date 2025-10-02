import java.util.Scanner;

public class Penggajian {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Jam kerja : ");
    int jamKerja = input.nextInt();

    int upahPerJam = 5000;
    int upahLembur = 6000;
    int dendaPerJam = 1000;

    int upah = 0;
    int lembur = 0;
    int denda = 0;
    int total = 0;

    if (jamKerja > 60) {
      upah = 60 * upahPerJam;
      lembur = (jamKerja - 60) * upahLembur;
      denda = 0;
    } else if (jamKerja >= 50) {
      upah = jamKerja * upahPerJam;
      lembur = 0;
      denda = 0;
    } else {
      upah = jamKerja * upahPerJam;
      lembur = 0;
      denda = (50 - jamKerja) * dendaPerJam;
    }

    total = upah + lembur - denda;

    System.out.println("Upah   = Rp. " + upah);
    System.out.println("Lembur = Rp. " + lembur);
    System.out.println("Denda  = Rp. " + denda);
    System.out.println("---------------------");
    System.out.println("Total  = Rp. " + total);

    input.close();
  }
}