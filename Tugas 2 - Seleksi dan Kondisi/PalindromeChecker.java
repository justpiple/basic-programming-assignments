import java.util.Scanner;

public class PalindromeChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a three-digit integer: ");
    String number = input.next();

    if (!number.matches("\\d+") || number.length() > 3) {
      System.out.println("Enter a valid integer!");
      System.exit(0);
    }

    if (number.charAt(0) == number.charAt(2))
      System.out.println(number + " is a palindrome");
    else
      System.out.println(number + " is not a palindrome");

    input.close();

  }
}