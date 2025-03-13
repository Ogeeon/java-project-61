package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        int number;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            number = r.nextInt(MAX_NUMBER);
            String[] roundData = new String[2];
            roundData[0] = String.valueOf(number);
            roundData[1] = (number % 2 == 0) ? "yes" : "no";
            gameData[i] = roundData;
        }

        Engine.playGame(instructions, gameData);
    }
}
