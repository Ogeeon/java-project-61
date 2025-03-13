package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;

    public static void playGame(String instructions, String[][] gameData) {
        String playerName = greet();
        System.out.println(instructions);
        Scanner sc = new Scanner(System.in);
        String answer;
        for (String[] round: gameData) {
            if (round.length < 2) {
                throw new RuntimeException("Malformed round data: " + Arrays.deepToString(round));
            }
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            answer = sc.nextLine();
            if (answer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                        answer, round[1], playerName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", playerName);
    }

    private static String greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}
