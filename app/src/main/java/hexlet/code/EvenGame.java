package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void run() {
        String playerName = Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnsCount = 0;
        int number = 0;
        String answer = "";
        String correctAnswer = "";
        Scanner sc = new Scanner(System.in);
        while (correctAnsCount < 3) {
            number = (int) (100 * Math.random());
            correctAnswer = (number % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + number);
            answer = sc.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnsCount++;
                continue;
            }
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                    answer, correctAnswer, playerName);
            System.exit(1);
        }
        System.out.printf("Congratulations, %s!", playerName);
    }
}
