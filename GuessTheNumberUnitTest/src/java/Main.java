import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NumberGame numbergame = new NumberGame();
        System.out.println(numbergame.intro());
        System.out.println(numbergame.promptUser());

        int number = numbergame.Randnum();
        int guess = 0;

        int attempt = 0;
        do {
            guess++;
            attempt = numbergame.getUserInput(scanner);
            if (attempt == number) {
                System.out.println(numbergame.winner());
                System.exit(0);
            } else if (attempt > number) {
                System.out.println(numbergame.tooHigh());
            } else if (attempt < number) {
                System.out.println(numbergame.tooLow());
            }
        } while (guess<7);

        if (guess>=7) {
            System.out.println(numbergame.ranOut());
        }
    }
}