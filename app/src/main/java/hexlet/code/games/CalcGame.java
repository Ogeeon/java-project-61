package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame implements Game {
    public static void startGame() {
        String instructions = "What is the result of the expression?";
        String[] questions = new String[3];
        String[] answers = new String[3];
        int a;
        int b;
        int result;
        boolean isSum;

        for (int i = 0; i < 3; i++) {
            a = (int) (100 * Math.random());
            b = (int) (100 * Math.random());
            isSum = Math.random() > 0.5;
            questions[i] = "Question: " + a + (isSum ? " + " : " - ") + b;
            result = a + (isSum ? 1 : -1) * b;
            answers[i] = String.valueOf(result);
        }

        Engine.playGame(instructions, questions, answers);
    }
}
