package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class PrimeGame {
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        int num;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            num = r.nextInt(MAX_NUMBER);
            String[] roundData = new String[2];
            roundData[0] = String.format("Question: %d", num);
            roundData[1] = isPrime(num) ? "yes" : "no";
            gameData[i] = roundData;
        }

        Engine.playGame(instructions, gameData);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
