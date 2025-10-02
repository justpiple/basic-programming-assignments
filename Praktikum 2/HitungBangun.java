import java.util.Scanner;

public class HitungBangun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Menu:");
    System.out.println("1. menghitung luas dan keliling persegi panjang");
    System.out.println("2. menghitung luas dan keliling lingkaran");
    System.out.println("3. menghitung luas dan keliling segitiga");
    System.out.print("\nPilihan anda: ");
    int pilihan = input.nextInt();

    switch (pilihan) {
      case 1:
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();
        double luasPP = p * l;
        double kelilingPP = 2 * (p + l);
        System.out.println("\nKeliling persegi panjang\t: " + kelilingPP + " cm");
        System.out.println("Luas persegi panjang\t\t: " + luasPP + " cm^2");
        break;

      case 2:
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;
        System.out.println("\nKeliling lingkaran\t: " + kelilingLingkaran + " cm");
        System.out.println("Luas lingkaran\t\t: " + luasLingkaran + " cm^2");
        break;

      case 3:
        System.out.print("Masukkan a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan r: ");
        double c = input.nextDouble();
        double kelilingSegitiga = a + b + c;
        double s = kelilingSegitiga / 2;
        double luasSegitiga = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("\nKeliling segitiga\t: " + kelilingSegitiga + " cm");
        System.out.println("Luas segitiga\t\t: " + luasSegitiga + " cm^2");
        break;

      default:
        System.out.println("Menu tidak ada.");
        break;
    }

    input.close();
  }
}
