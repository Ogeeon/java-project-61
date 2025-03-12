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
        int firstNum;
        int increment;
        int hiddenNumPos;
        Random r = new Random();

        firstNum = r.nextInt(MAX_FIRST_NUMBER);
        increment = r.nextInt(MAX_INCREMENT) + 1;
        hiddenNumPos = r.nextInt(PROGRESSION_LENGTH);
        String[] progressionData = prepareProgression(firstNum, increment, hiddenNumPos).split(";");
        String[] roundData = new String[2];
        roundData[0] = "Question: " + progressionData[0];
        roundData[1] = progressionData[1];
        return roundData;
    }

    private static String prepareProgression(int firstNum, int increment, int hiddenNumPos) {
        int next;
        int correctAnswer = 0;
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < PROGRESSION_LENGTH; j++) {
            next = firstNum + increment * j;
            if (j == hiddenNumPos) {
                sb.append(".. ");
                correctAnswer = next;
            } else {
                sb.append(next);
                sb.append(" ");
            }
        }
        sb.append(";").append(correctAnswer);
        return sb.toString();
    }
}
