package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int primeNumber = Utils.getMaxRandom(Utils.MAX_RANDOM);
            questionAndAnswer[i][0] = Integer.toString(primeNumber);
            questionAndAnswer[i][1] = isPrime(primeNumber) ? "yes" : "no";
        }
        Engine.runGame(RULES, questionAndAnswer);
    }

    private static boolean isPrime(int primeNumber) {

        if (primeNumber ==1 || primeNumber == 0) {
            return false;
        }

        for (int i = 2; i < primeNumber / 2; ++i) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
