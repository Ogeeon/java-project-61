package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    private static final int CHOICE_EXIT = 0;
    private static final int CHOICE_GREET = 1;
    private static final int CHOICE_EVEN = 2;

    public static void main(String[] args) {
        String greeting = "Please enter the game number and press Enter.\n"
                + CHOICE_GREET + " - Greet\n"
                + CHOICE_EVEN + " - Even\n"
                + CHOICE_EXIT + " - Exit\n"
                + "Your choice: ";
        System.out.println(greeting);
        int choice = -1;
        while (choice < CHOICE_EXIT || choice > CHOICE_EVEN) {
            choice = getChoice();
            switch (choice) {
                case CHOICE_EXIT -> System.exit(0);
                case CHOICE_GREET -> Cli.greetUser();
                case CHOICE_EVEN -> EvenGame.startGame();
                default -> {
                    System.out.println(greeting);
                }
            }
        }
    }

    private static int getChoice() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            return -1;
        }
    }
}
