package hexlet.code;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        System.out.print("Your choice: ");
        int choiceNumber = scanner.nextInt();
        if (choiceNumber == 1) {
            Greet.userName();
        } else if (choiceNumber == 2) {
            Greet.userName();
            EvenNumber.runGame();
        }
    }
}
