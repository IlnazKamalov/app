package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenNumber;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");


        Scanner scanner = new Scanner(System.in);
        String choiceNumber = String.valueOf(scanner.next());


        switch (choiceNumber) {
            case "1" -> Cli.getName();
            case "2" -> EvenNumber.runGame();
            case "3" -> Calc.runGame();
            case "0" -> System.out.println("Exit");
            default -> System.out.println("Unknown, command!");
        }
    }
}
