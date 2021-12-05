package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    private final static int MIN_RANGE = 1;
    private final static int MAX_RANGE = 99;

    public static void game() {
        Engine.gameStart("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = Engine.random(MIN_RANGE, MAX_RANGE);
            boolean answer = isPrime(number);
            Engine.printQuestion(number + "");
            String input = Cli.SCANNER.nextLine();
            if (("yes".equals(input) && answer) || ("no".equals(input) && !answer)) {
                Engine.printCorrect();
            } else {
                Engine.printWrong(input, answer + "");
            }
        }
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}
