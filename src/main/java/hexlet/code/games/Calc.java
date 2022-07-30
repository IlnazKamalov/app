package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String[] OPERATOR = new String[] {"+", "-", "*"};
    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int numberFirst = Utils.getMaxRandom(Utils.MAX_RANDOM);
            int numberSecond = Utils.getMaxRandom(Utils.MAX_RANDOM);
            String operator = OPERATOR[Utils.getMaxRandom(OPERATOR.length)];
            questionAndAnswer[i][0] = String.format("%s %s %s", numberFirst, operator, numberSecond);
            questionAndAnswer[i][1] = getOperator(operator, numberFirst, numberSecond);
        }
        Engine.runGame("What is the result of the expression?", questionAndAnswer);
    }
    private static String getOperator(String operator, int numberFirst, int numberSecond) {
        return switch (operator) {
            case "+" -> Integer.toString(numberFirst + numberSecond);
            case "-" -> Integer.toString(numberFirst - numberSecond);
            case "*" -> Integer.toString(numberFirst * numberSecond);
            default -> "Unknown operator!";
        };
    }
}
