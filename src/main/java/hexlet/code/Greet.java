package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static String name;
    public static String userName() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = inputName.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static String name() {
        return name;
    }
}

