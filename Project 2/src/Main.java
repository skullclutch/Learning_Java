import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void game() {
        RandNum();
        guess();
    }


    public static void guess() {
        int guess;
        int attempt = 0;
        int number = RandNum();
        char keepPlaying = 0;
        do {
            System.out.println("Take a guess.");
            guess = 0;
            do {
                guess++;
                try {
                    attempt = sc.nextInt();
                } catch (InputMismatchException f) {
                    System.out.println("In the method guess due to Exception " + f);
                }
                if (number == attempt) {
                    System.out.println("Good job! You guessed my number!");
                    break;
                } else {
                    compareNums(number, attempt);
                }
            } while (guess < 7);

            if (guess >= 7) {
                System.out.println("You've used all your attempts.");
            }

            System.out.println();
            System.out.println("Would you like to play again? (y or n)");
            try {
                keepPlaying = sc.next().charAt(0);
            } catch (InputMismatchException c) {
                System.out.println("In the keepPlaying Block due to Exception " + c);
                sc.next();
            }
            if (keepPlaying != 'y') {
                System.out.println("Thanks for playing.");
                System.exit(0);
            }

        } while (keepPlaying != 'n');
    }

    public static void compareNums(int randNum, int userNum) {
        if (userNum < randNum) {
            System.out.println("Your guess is too low.");
        } else if (userNum > randNum) {
            System.out.println("Your guess is too high.");
        }
    }

    public static void name() {
        String name;
        do {
            try {
                name = sc.nextLine();
                System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.");
            } catch (InputMismatchException e) {
                System.out.println("In the method name due to Exception " + e);
            }
        } while (false);
    }

    public static int RandNum() {
        int number;

        number = 1 + (int) (20 * Math.random());
        return number;
    }



    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        name();
        game();
    }

}