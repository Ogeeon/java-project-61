package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalcGame {
    private static final int MAX_NUMBER = 100;
    private static final int OPERATION_ADD = 1;
    private static final int OPERATION_SUBTRACT = 2;
    private static final int OPERATION_MULTIPLY = 3;

    public static void startGame() {
        String instructions = "What is the result of the expression?";
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        int a;
        int b;
        int result;
        int operation;
        Random r = new Random();
        List<Integer> operations = new ArrayList<>();
        operations.add(OPERATION_ADD);
        operations.add(OPERATION_SUBTRACT);
        operations.add(OPERATION_MULTIPLY);

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            a = r.nextInt(MAX_NUMBER);
            b = r.nextInt(MAX_NUMBER);
            operation = operations.get(r.nextInt(operations.size()));
            result = calcExpressionResult(a, b, operation);
            String[] roundData = new String[2];
            roundData[0] = String.format("Question: %d %s %d", a, getOperationSymbol(operation), b);
            roundData[1] = String.valueOf(result);
            gameData[i] = roundData;
        }

        Engine.playGame(instructions, gameData);
    }

    private static int calcExpressionResult(int a, int b, int operation) {
        switch (operation) {
            case OPERATION_ADD: return a + b;
            case OPERATION_SUBTRACT: return a - b;
            case OPERATION_MULTIPLY: return a * b;
            default: throw new UnsupportedOperationException("Wrong operation ID");
        }
    }

    private static String getOperationSymbol(int operation) {
        switch (operation) {
            case OPERATION_ADD: return "+";
            case OPERATION_SUBTRACT: return "-";
            case OPERATION_MULTIPLY: return "*";
            default: throw new UnsupportedOperationException("Wrong operation ID");
        }
    }
}
