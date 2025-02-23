package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String playerName = sc.nextLine();
        while (playerName.isBlank()) {
            System.out.print("Sorry, didn't get it. What is your name? ");
            playerName = sc.nextLine();
        }
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}
