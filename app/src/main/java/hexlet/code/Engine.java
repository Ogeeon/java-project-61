package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String instructions, String[] questions, String[] answers) {
        String playerName = Cli.greetUser();
        System.out.println(instructions);
        Scanner sc = new Scanner(System.in);
        String answer;
        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i]);
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
