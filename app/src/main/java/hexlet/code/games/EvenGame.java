package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void startGame() {
        String instructions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] answers = new String[3];
        int number;

        for (int i = 0; i < 3; i++) {
            number = (int) (100 * Math.random());
            questions[i] = "Question: " + number;
            answers[i] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.playGame(instructions, questions, answers);
    }
}
