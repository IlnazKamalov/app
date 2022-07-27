package hexlet.code;

import java.util.Objects;
import java.util.Scanner;


public class EvenNumber {
    private static final Scanner INPUT_ANSWER = new Scanner(System.in);
    private static final int INDEX = 3;
    private static final int FACTOR = 99;

    public static void runGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < INDEX; i++) {
            int randomNumber = (int) (Math.random() * FACTOR);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = INPUT_ANSWER.nextLine();
            String yesAnswer = "yes";
            String noAnswer = "no";
            if (randomNumber % 2 == 0 && userAnswer.equals(yesAnswer)) {
                System.out.println("Correct!");
            } else if (randomNumber % 2 != 0 && userAnswer.equals(noAnswer)) {
                System.out.println("Correct!");
            } else if (randomNumber % 2 == 0 && !Objects.equals(userAnswer, yesAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, %s!%n",
                        userAnswer, Greet.name());
                break;
            } else if (randomNumber % 2 != 0 && !Objects.equals(userAnswer, noAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, %s!%n",
                        userAnswer, Greet.name());
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + Greet.name() + "!");
            }
        }
    }
}
