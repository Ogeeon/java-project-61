package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class CalcGame {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "What is the result of the expression?";
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        int a;
        int b;
        int result;
        boolean isSum;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            a = r.nextInt(MAX_NUMBER);
            b = r.nextInt(MAX_NUMBER);
            isSum = r.nextBoolean();
            questions[i] = String.format("Question: %d %s %d", a, (isSum ? " + " : " - "), b);
            result = a + (isSum ? 1 : -1) * b;
            answers[i] = String.valueOf(result);
        }

        Engine.playGame(instructions, questions, answers);
    }
}
