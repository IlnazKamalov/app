package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final int PROGRESSION_LENGTH = 10;
    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int numberFirst = Utils.getMaxRandom(Utils.MAX_RANDOM);
            int stepProgress = Utils.getMaxRandom(PROGRESSION_LENGTH);
            int number = Utils.getMaxRandom(PROGRESSION_LENGTH);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == number) {
                    stringBuilder.append(".. ");
                    questionAndAnswer[i][1] = String.valueOf(numberFirst + stepProgress * j);
                } else {
                    stringBuilder.append(numberFirst + stepProgress * j).append(" ");
                }
            }
            questionAndAnswer[i][0] = stringBuilder.toString();
        }
        Engine.runGame("What number is missing in the progression?", questionAndAnswer);
    }
}
