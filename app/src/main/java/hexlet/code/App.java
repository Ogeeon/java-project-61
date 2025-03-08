package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    private static final int CHOICE_EXIT = 0;
    private static final int CHOICE_GREET = 1;
    private static final int CHOICE_EVEN = 2;
    private static final int CHOICE_CALC = 3;
    private static final int CHOICE_GCD = 4;
    private static final int CHOICE_PROGRESSION = 5;
    private static final int CHOICE_PRIME = 6;

    public static void main(String[] args) {
        String greeting = "Please enter the game number and press Enter.\n"
                + CHOICE_GREET + " - Greet\n"
                + CHOICE_EVEN + " - Even\n"
                + CHOICE_CALC + " - Calc\n"
                + CHOICE_GCD + " - GCD\n"
                + CHOICE_PROGRESSION + " - Progression\n"
                + CHOICE_PRIME + " - Prime\n"
                + CHOICE_EXIT + " - Exit\n"
                + "Your choice: ";
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(greeting);
        choice = getChoice(sc);
        switch (choice) {
            case CHOICE_EXIT: break;
            case CHOICE_GREET: Cli.greetUser(); break;
            case CHOICE_EVEN: EvenGame.startGame(); break;
            case CHOICE_CALC: CalcGame.startGame(); break;
            case CHOICE_GCD: GCDGame.startGame(); break;
            case CHOICE_PROGRESSION: ProgressionGame.startGame(); break;
            case CHOICE_PRIME: PrimeGame.startGame(); break;
            default: throw new RuntimeException("Unknown user choice: " + choice);
        }
        sc.close();
    }

    private static int getChoice(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            sc.next();
            return -1;
        }
    }
}
