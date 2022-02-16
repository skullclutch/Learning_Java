import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.intro());
        System.out.println(dragon.promptUser());

        if (dragon.getUserInput(scanner) == 1) {
            System.out.println(dragon.alive());
        }else {
            System.out.println(dragon.death());
        }

        System.out.println("\nThank you for playing");
    }
}
