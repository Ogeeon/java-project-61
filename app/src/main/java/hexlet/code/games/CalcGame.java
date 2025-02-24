package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final double HALF = 0.5;
    public static void startGame() {
        String instructions = "What is the result of the expression?";
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        int a;
        int b;
        int result;
        boolean isSum;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            a = (int) (MAX_NUMBER * Math.random());
            b = (int) (MAX_NUMBER * Math.random());
            isSum = Math.random() > HALF;
            questions[i] = "Question: " + a + (isSum ? " + " : " - ") + b;
            result = a + (isSum ? 1 : -1) * b;
            answers[i] = String.valueOf(result);
        }

        Engine.playGame(instructions, questions, answers);
    }
}
