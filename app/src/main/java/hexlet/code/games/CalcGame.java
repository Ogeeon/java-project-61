package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class CalcGame {
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "What is the result of the expression?";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        int a;
        int b;
        int result;
        boolean isSum;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            a = r.nextInt(MAX_NUMBER);
            b = r.nextInt(MAX_NUMBER);
            isSum = r.nextBoolean();
            result = calcExpressionResult(a, b, isSum);
            String[] roundData = new String[2];
            roundData[0] = String.format("Question: %d %s %d", a, (isSum ? "+" : "-"), b);
            roundData[1] = String.valueOf(result);
            gameData[i] = roundData;
        }

        Engine.playGame(instructions, gameData);
    }

    private static int calcExpressionResult(int a, int b, boolean isSum) {
        return a + (isSum ? 1 : -1) * b;
    }
}
