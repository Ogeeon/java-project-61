package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String instructions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];
        int number;
        Random r = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            number = r.nextInt(MAX_NUMBER);
            questions[i] = "Question: " + number;
            answers[i] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.playGame(instructions, questions, answers);
    }
}
