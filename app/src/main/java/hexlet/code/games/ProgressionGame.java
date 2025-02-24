package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame implements Game {
    private static final int PROGRESSION_LENGTH = 10;

    public static void startGame() {
        String instructions = "What number is missing in the progression?";
        String[] questions = new String[3];
        String[] answers = new String[3];
        int first;
        int increment;
        int next;
        int hiddenNumPos;
        StringBuilder sb;

        for (int i = 0; i < 3; i++) {
            first = (int) (10 * Math.random());
            increment = (int) (9 * Math.random() + 1);
            hiddenNumPos = (int) (9 * Math.random());
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
