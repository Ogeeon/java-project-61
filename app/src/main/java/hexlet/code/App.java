package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    private static final int CHOICE_EXIT = 0;
    private static final int CHOICE_GREET = 1;
    private static final int CHOICE_EVEN = 2;
    private static final int CHOICE_CALC = 3;
    private static final int CHOICE_GCD = 4;
    private static final int CHOICE_PROGRESSION = 5;

    public static void main(String[] args) {
        String greeting = "Please enter the game number and press Enter.\n"
                + CHOICE_GREET + " - Greet\n"
                + CHOICE_EVEN + " - Even\n"
                + CHOICE_CALC + " - Calc\n"
                + CHOICE_GCD + " - GCD\n"
                + CHOICE_PROGRESSION + " - Progression\n"
                + CHOICE_EXIT + " - Exit\n"
                + "Your choice: ";
        int choice;
        while (true) {
            System.out.println(greeting);
            choice = getChoice();
            switch (choice) {
                case CHOICE_EXIT: return;
                case CHOICE_GREET: Cli.greetUser(); return;
                case CHOICE_EVEN: EvenGame.startGame(); return;
                case CHOICE_CALC: CalcGame.startGame(); return;
                case CHOICE_GCD: GCDGame.startGame(); return;
                case CHOICE_PROGRESSION: ProgressionGame.startGame(); return;
                default:
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
