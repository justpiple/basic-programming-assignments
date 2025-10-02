import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("\nMASUKKAN PILIHAN ANDA: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double length = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double width = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double height = input.nextDouble();
                    double volumeBlock = length * width * height;
                    System.out.println("Volume Balok = " + volumeBlock + "\n");
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double radiusSphere = input.nextDouble();
                    double volumeSphere = (4.0 / 3.0) * Math.PI * Math.pow(radiusSphere, 3);
                    System.out.println("Volume Bola = " + volumeSphere + "\n");
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari alas: ");
                    double radiusCone = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double heightCone = input.nextDouble();
                    double volumeCone = (1.0 / 3.0) * Math.PI * Math.pow(radiusCone, 2) * heightCone;
                    System.out.println("Volume Kerucut = " + volumeCone + "\n");
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari alas: ");
                    double radiusCylinder = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double heightCylinder = input.nextDouble();
                    double volumeCylinder = Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder;
                    System.out.println("Volume Silinder = " + volumeCylinder + "\n");
                    break;

                case 5:
                    System.out.print("Masukkan luas alas segitiga: ");
                    double baseArea = input.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double heightPyramid = input.nextDouble();
                    double volumePyramid = (1.0 / 3.0) * baseArea * heightPyramid;
                    System.out.println("Volume Limas Segitiga = " + volumePyramid + "\n");
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        } while (choice != 0);

        input.close();
    }
}