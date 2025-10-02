public class EightQueens {

  private static final int BOARD_SIZE = 8;

  public static void main(String[] args) {
    int[] queens = new int[BOARD_SIZE];

    if (solveNQueens(queens, 0)) {
      printSolution(queens);
    } else {
      System.out.println("No Solutions");
    }
  }

  private static boolean solveNQueens(int[] queens, int col) {
    if (col >= BOARD_SIZE) {
      return true;
    }

    for (int row = 0; row < BOARD_SIZE; row++) {
      queens[col] = row;

      if (isSafe(queens, col) && solveNQueens(queens, col + 1)) {
        return true;

      }
    }

    return false;
  }

  private static boolean isSafe(int[] queens, int currentCol) {
    for (int i = 0; i < currentCol; i++) {
      if (queens[i] == queens[currentCol]) {
        return false;
      }

      if (Math.abs(queens[i] - queens[currentCol]) == Math.abs(i - currentCol)) {
        return false;
      }
    }
    return true;
  }

  private static void printSolution(int[] queens) {
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int col = 0; col < BOARD_SIZE; col++) {
        if (queens[col] == row) {
          System.out.print("|Q");
        } else {
          System.out.print("| ");
        }
      }
      System.out.println("|");
    }
  }
}