package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    public static void startGame() {
        String instructions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[MAX_ROUNDS];
        String[] answers = new String[MAX_ROUNDS];
        int num;
        Random r = new Random();

        for (int i = 0; i < MAX_ROUNDS; i++) {
            num = r.nextInt(MAX_NUMBER) ;
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
