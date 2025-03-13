package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCDGame {
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        int a;
        int b;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            a = r.nextInt(MAX_NUMBER) + 1;
            b = r.nextInt(MAX_NUMBER) + 1;
            String[] roundData = new String[2];
            roundData[0] = String.format("%d %d", a, b);
            roundData[1] = String.valueOf(gcd(a, b));
            gameData[i] = roundData;
        }

        Engine.playGame(instructions, gameData);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
