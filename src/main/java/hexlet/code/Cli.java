package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner inputName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = inputName.nextLine();
        System.out.println("Hello, " + name + "!");
        return  "Hello, " + name + "!";
    }
}
