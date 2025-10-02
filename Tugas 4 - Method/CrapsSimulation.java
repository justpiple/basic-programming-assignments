import java.util.Random;

public class CrapsSimulation {
    public static void main(String[] args) {
        final int TOTAL_GAMES = 10000;
        int wins = 0;

        for (int i = 0; i < TOTAL_GAMES; i++) {
            if (playCraps()) {
                wins++;
            }
        }

        System.out.println("Total games: " + TOTAL_GAMES);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (TOTAL_GAMES - wins));
    }

    public static boolean playCraps() {
        int sum = rollDice();

   
        // true = win, lose = false.

        if (sum == 7 || sum == 11) {
            return true;
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return false;
        }

        int point = sum;
        while (true) {
            sum = rollDice();
            if (sum == point) {
                return true;
            } else if (sum == 7) {
                return false;
            }
        }
    }
     
    public static int rollDice() {
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int sum = die1 + die2;
        
        return sum;
    }
}
