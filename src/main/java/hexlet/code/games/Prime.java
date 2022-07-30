package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int primeNumber = Utils.getMaxRandom(Utils.MAX_RANDOM);
            questionAndAnswer[i][0] = Integer.toString(primeNumber);
            questionAndAnswer[i][1] = isPrime(primeNumber) ? "yes" : "no";
        }
        Engine.runGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionAndAnswer);
    }
    private static boolean isPrime(int primeNumber) {
        if (primeNumber % 2 == 0) {
            return false;
        }
        for (int i = Engine.ROUNDS_COUNT; i * i <= primeNumber; i += 2) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
