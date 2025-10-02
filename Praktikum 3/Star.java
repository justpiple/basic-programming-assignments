import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nilai n = ");
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      String line = (" ".repeat(n - i)) + ("*".repeat(i + 1));
      System.out.println(line);
    }

    scan.close();
  }
}
