package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;

    public static void playGame(String instructions, String[] questions, String[] answers) {
        String playerName = Cli.greetUser();
        System.out.println(instructions);
        Scanner sc = new Scanner(System.in);
        String answer;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            answer = sc.nextLine();
            if (answer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                        answer, answers[i], playerName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", playerName);
    }
}
