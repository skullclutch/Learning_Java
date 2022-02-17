import java.util.Scanner;

public class NumberGame {

    public String intro() {
        return "I am thinking of a number between 1 and 20.";
    }

    public String promptUser() {
        return "Take a guess.";
    }

    public int Randnum() {
        int number;
        number = 1 + (int) (20 * Math.random());
        return number;
    }

    public String winner() {
        return "Good job! You guessed my number.";
    }

    public String ranOut() {
        return"You've used all your attempts.";
    }

    public String tooHigh() {
        return "Too high";
    }

    public String tooLow() {
        return "Too low";
    }

    public int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }
}
