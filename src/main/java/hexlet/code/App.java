package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getName;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                0 - Exit""");
        System.out.print("Your choice: ");
        int choiceNumber = scanner.nextInt();
        if (choiceNumber == 1) {
            System.out.println("Welcome to the Brain Game!");
            getName();
        }
    }
}
