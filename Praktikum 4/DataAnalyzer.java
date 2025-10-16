import java.util.Scanner;

public class DataAnalyzer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] data = new int[20];
    int dataCount = 0;

    while (true) {
      System.out.println("1. Input Data");
      System.out.println("2. Lihat Data");
      System.out.println("3. Average");
      System.out.println("4. Sum");
      System.out.println("5. Max");
      System.out.println("6. Min");
      System.out.println("7. Keluar");
      System.out.print("Masukkan nilai: ");
      int choice = scanner.nextInt();

      if (choice == 7) {
        System.out.println("Keluar dari program.");
        scanner.close();
        break;
      }

      if (choice != 1 && choice != 7 && dataCount == 0) {
        System.out.println("Inputkan data terlebih dahulu\n");
        continue;
      }

      switch (choice) {
        case 1:
          int n;
          do {
            System.out.print("Berapa banyak data yang ingin diinputkan (maksimal 20 data): ");
            n = scanner.nextInt();

            if (n > 20) {
              System.out.println("Jumlah data terlalu banyak");
            } else if (n < 1) {
              System.out.println("Jumlah data harus valid");
            } else {
              dataCount = n;
              for (int i = 0; i < n; i++) {
                System.out.print("Masukkan data ke-" + (i + 1) + ": ");
                data[i] = scanner.nextInt();
              }
            }
          } while (n < 1 || n > 20);
          break;

        case 2:
          System.out.print("Data: ");
          for (int i = 0; i < dataCount; i++) {
            System.out.print(data[i] + " ");
          }
          break;

        case 3:
          double sumData = 0;
          for (int i = 0; i < dataCount; i++) {
            sumData += data[i];
          }
          double average = sumData / dataCount;
          System.out.println("Rata-rata data: " + average);

          break;

        case 4:
          int sum = 0;
          for (int i = 0; i < dataCount; i++) {
            sum += data[i];
          }
          System.out.println("Jumlah total data: " + sum);

          break;

        case 5:
          int max = data[0];
          for (int i = 1; i < dataCount; i++) {
            if (data[i] > max) {
              max = data[i];
            }
          }
          System.out.println("Nilai terbesar: " + max);
          break;

        case 6:
          int min = data[0];
          for (int i = 1; i < dataCount; i++) {
            if (data[i] < min) {
              min = data[i];
            }
          }
          System.out.println("Nilai terkecil: " + min);
          break;

        default:
          System.out.println("Pilihan tidak valid, silakan coba lagi.");
      }
      System.out.println();
    }
  }
}
