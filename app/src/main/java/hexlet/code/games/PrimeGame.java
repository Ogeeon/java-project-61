package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void startGame() {
        String instructions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] answers = new String[3];
        int num;

        for (int i = 0; i < 3; i++) {
            num = (int) (100 * Math.random() + 1);
            questions[i] = String.format("Question: %d", num);
            answers[i] = isPrime(num) ? "yes" : "no";
        }

        Engine.playGame(instructions, questions, answers);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
