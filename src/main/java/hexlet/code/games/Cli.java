package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
