package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class EvenNumber {

    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getMaxRandom(Utils.MAX_RANDOM);
            questionAndAnswer[i][0] = Integer.toString(number);
            questionAndAnswer[i][1] = evenNumber(number) ? "yes" : "no";
        }
        Engine.runGame(RULES, questionAndAnswer);
    }

    private static boolean evenNumber(int number) {
        return number % 2 == 0;
    }
}
