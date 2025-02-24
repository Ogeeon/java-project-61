package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCDGame {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    public static void startGame() {
        String instructions = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        int a;
        int b;
        Random r = new Random();

        for (int i = 0; i < MAX_ROUNDS; i++) {
            a = r.nextInt(MAX_NUMBER) + 1;
            b = r.nextInt(MAX_NUMBER) + 1;
            questions[i] = String.format("Question: %d %d", a, b);
            answers[i] = String.valueOf(gcd(a, b));
        }

        Engine.playGame(instructions, questions, answers);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
