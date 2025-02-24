package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_FIRST_NUMBER = 10;
    private static final int MAX_INCREMENT = 10;
    private static final int PROGRESSION_LENGTH = 10;

    public static void startGame() {
        String instructions = "What number is missing in the progression?";
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        int first;
        int increment;
        int next;
        int hiddenNumPos;
        StringBuilder sb;
        Random r = new Random();

        for (int i = 0; i < MAX_ROUNDS; i++) {
            first = r.nextInt(MAX_FIRST_NUMBER);
            increment = r.nextInt(MAX_INCREMENT) + 1;
            hiddenNumPos = r.nextInt(PROGRESSION_LENGTH);
            sb  = new StringBuilder("Question: ");
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                next = first + increment * j;
                if (j == hiddenNumPos) {
                    sb.append(".. ");
                    answers[i] = String.valueOf(next);
                } else {
                    sb.append(next);
                    sb.append(" ");
                }
            }
            questions[i] = sb.toString();
        }

        Engine.playGame(instructions, questions, answers);
    }
}
