package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    public static void startGame() {
        String instructions = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] answers = new String[3];
        int a;
        int b;

        for (int i = 0; i < 3; i++) {
            a = (int) (100 * Math.random());
            b = (int) (100 * Math.random());
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
