package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    private static final int MAX_FIRST_NUMBER = 10;
    private static final int MAX_INCREMENT = 10;
    private static final int PROGRESSION_LENGTH = 10;

    public static void startGame() {
        String instructions = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            gameData[i] = prepareRoundData();
        }

        Engine.playGame(instructions, gameData);
    }

    private static String[] prepareRoundData() {
        int first;
        int increment;
        int next;
        int hiddenNumPos;
        StringBuilder sb;
        Random r = new Random();

        first = r.nextInt(MAX_FIRST_NUMBER);
        increment = r.nextInt(MAX_INCREMENT) + 1;
        hiddenNumPos = r.nextInt(PROGRESSION_LENGTH);
        sb  = new StringBuilder("Question: ");
        String[] roundData = new String[2];
        for (int j = 0; j < PROGRESSION_LENGTH; j++) {
            next = first + increment * j;
            if (j == hiddenNumPos) {
                sb.append(".. ");
                roundData[1] = String.valueOf(next);
            } else {
                sb.append(next);
                sb.append(" ");
            }
        }
        roundData[0] = sb.toString();
        return roundData;
    }
}
