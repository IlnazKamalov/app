package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int numberFirst = Utils.getMaxRandom(Utils.MAX_RANDOM);
            int numberSecond = Utils.getMaxRandom(Utils.MAX_RANDOM);
            questionAndAnswer[i][0] = String.format("%s %s", numberFirst, numberSecond);
            questionAndAnswer[i][1] = String.valueOf(gcdByEuclidAlgorithm(numberFirst, numberSecond));
        }
        Engine.runGame(RULES, questionAndAnswer);
    }
    private static int gcdByEuclidAlgorithm(int numberFirst, int numberSecond) {

        if (numberSecond == 0) {
            return numberFirst;
        }
        int result = numberFirst % numberSecond;
        return gcdByEuclidAlgorithm(numberSecond, result);
    }
}
