package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Progression {

    public static final int PROGRESSION_MAX = 20;

    public static final int PROGRESSION_MIN = 5;

    public static final int BEGIN = 1;

    public static final int STEP = 10;

    private static final String RULES = "What number is missing in the progression?";

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int begin = Utils.getMaxRandom(BEGIN);
            int sequence = Utils.getMinMaxRandom(PROGRESSION_MIN, PROGRESSION_MAX);
            int step = Utils.getMinMaxRandom(1, STEP);
            int[] numbers = generateProgression(begin, sequence, step);
            int numPosition = Utils.getMinMaxRandom(0, numbers.length);
            questionAndAnswer[i][0] = question(numbers, numPosition);
            questionAndAnswer[i][1] = String.valueOf(numbers[numPosition]);
        }
        Engine.runGame(RULES, questionAndAnswer);
    }
    private static int[] generateProgression(int begin, int sequence, int step) {

        int[] numbers = new int[sequence];

        for (int i = 0; i < numbers.length; i++) {
            var numProgression = begin + i * step;
            numbers[i] = numProgression;
        }
        return numbers;
    }
    public static String question(int[] numbers, int numPosition) {

        StringBuilder stringBuilder = new StringBuilder();

        if (numPosition == 0) {
            stringBuilder.append("..");
        } else {
            stringBuilder.append(numbers[0]);
        }

        for (int i = 1; i < numbers.length; i++) {
            if (i == numPosition) {
                stringBuilder.append(" ..");
                continue;
            }
            stringBuilder.append(" ").append(numbers[i]);
        }
        return String.format(String.valueOf(stringBuilder));
    }
}
