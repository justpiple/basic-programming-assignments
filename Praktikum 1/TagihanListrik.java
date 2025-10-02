import java.util.Scanner;

public class TagihanListrik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Program penghitung pemakaian listrik sederhana");
    System.out.print("Masukkan Nama\t\t\t: ");
    String nama = sc.nextLine();

    System.out.print("Kelurahan\t\t\t: ");
    String kelurahan = sc.nextLine();

    System.out.print("Masukkan posisi awal Kwh Meter\t: ");
    int kwhAwal = sc.nextInt();

    System.out.print("Masukkan posisi akhir Kwh Meter\t: ");
    int kwhAkhir = sc.nextInt();

    System.out.print("Masukkan biaya beban saat ini\t: ");
    int biayaBeban = sc.nextInt();

    System.out.print("Masukkan PPJ (dalam persen)\t: ");
    int ppjPersen = sc.nextInt();

    int pemakaian = kwhAkhir - kwhAwal;
    int tarifListrik = pemakaian * biayaBeban;
    int ppj = (tarifListrik * ppjPersen) / 100;
    int totalBayar = tarifListrik + ppj;

    System.out.println("\n==================PLN " + kelurahan + "===================");
    System.out.println("Nama\t\t\t: " + nama);
    System.out.println("Kelurahan\t\t: " + kelurahan);
    System.out.println("Pemakaian bulan ini\t: " + pemakaian + " Kwh Meter");
    System.out.println("Tarif Listrik\t\t: Rp " + tarifListrik + ",-");
    System.out.println("PPJ " + ppjPersen + "%\t\t\t: Rp " + ppj + ",-");
    System.out.println("Total Bayar\t\t: Rp " + totalBayar + ",-");
    System.out.println("==================================================");

    sc.close();
  }
}