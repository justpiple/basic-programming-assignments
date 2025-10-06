import java.util.Random;

public class EvenNumberOfOnes {
  public static void main(String[] args) {
    int[][] matrix = new int[6][6];
    Random random = new Random();

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        matrix[i][j] = random.nextInt(2);
      }
    }

    // Display the matrix
    System.out.println("Matrix (6x6):");
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    boolean evenRows = true;
    for (int i = 0; i < 6; i++) {
      int count = 0;
      for (int j = 0; j < 6; j++) {
        if (matrix[i][j] == 1)
          count++;
      }
      if (count % 2 != 0) {
        evenRows = false;
        break;
      }
    }

    boolean evenCols = true;
    for (int j = 0; j < 6; j++) {
      int count = 0;
      for (int i = 0; i < 6; i++) {
        if (matrix[i][j] == 1)
          count++;
      }
      if (count % 2 != 0) {
        evenCols = false;
        break;
      }
    }

    System.out.println();
    if (evenRows)
      System.out.println("All rows have an even number of 1s.");
    else
      System.out.println("There is at least one row with an odd number of 1s.");

    if (evenCols)
      System.out.println("All columns have an even number of 1s.");
    else
      System.out.println("There is at least one column with an odd number of 1s.");
  }
}
