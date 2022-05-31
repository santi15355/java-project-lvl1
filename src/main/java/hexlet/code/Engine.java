package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int CONST_2 = 2;
    static final int CONST_5 = 5;
    static final int CONST_99 = 99;
    static final int ROUNDS = 3;
    static final int CONST_3 = 3;

    private static int countOfWin = 0;

    public static void incrementCountOfWin() {
        if (countOfWin < CONST_3) {
            countOfWin++;
        }
    }

    public static int getCountOfWin() {
        return countOfWin;
    }

    public static int getRoundsCount() {
        return ROUNDS;
    }

    public static int getRandomNumberFrom5to10() {
        return CONST_5 + (int) ((Math.random() * (CONST_5 + 1)));
    }

    public static int getRandomNumberFrom1to99() {
        return (CONST_2 - 1) + (int) (Math.random() * CONST_99);
    }

    public static void gameRun(String question, String answer) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner inputAnswer = new Scanner(System.in);
        String userAnswer = inputAnswer.nextLine();

        if (userAnswer.equals(answer)) {
            System.out.println("Correct!");
            incrementCountOfWin();
        } else {
            System.out.println("'" + userAnswer
                    + "' is wrong answer ;(. Correct answer was '"
                    + answer + "'");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            System.exit(0);
        }
        if (getCountOfWin() == CONST_3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
    public static void gameQuestion(String gameQuestion) {
        System.out.println(gameQuestion);
    }
}
