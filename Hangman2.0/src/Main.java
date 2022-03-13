import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class Main {


    public static boolean printWordState(String randomWord, ArrayList<String> playerGuesses) {
        int correctCount = 0;

        if (Stream.of(randomWord).anyMatch(playerGuesses::contains)) {
            System.out.println(playerGuesses);
            correctCount++;
        } else {
            System.out.println("-");
        }

        System.out.println();

        return (randomWord.length() == correctCount);
    }

    public static boolean getPlayerGuesses(Scanner keyboard, ArrayList<String> playerGuesses, String randomWord) {
        System.out.println("Please enter a letter");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess);
        return randomWord.contains(letterGuess);
    }

    public static void printHangedMan(int wrongCount) throws IOException {

        List<String> hangedMan = new ArrayList<>();
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=1.txt")));
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=2.txt")));
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=3.txt")));
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=4.txt")));
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=5.txt")));
        hangedMan.add(Files.readString(Paths.get("C:/Rowan/Notepad++/wrongCount=6.txt")));


        if (wrongCount >= 1) {
            System.out.println(hangedMan.get(0));
        }
        if (wrongCount >= 2) {
            System.out.print(hangedMan.get(1));
            if (wrongCount >= 3) {
                System.out.println(hangedMan.get(2));
            } else {
                System.out.println();
            }
        }
        if (wrongCount >= 4) {
            System.out.println(hangedMan.get(3));
        }
        if (wrongCount >= 5) {
            System.out.print(hangedMan.get(4));
            if (wrongCount >= 6) {
                System.out.println(hangedMan.get(5));
            } else {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }


    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        List<String> words = Files.readAllLines(Paths.get("C:/Rowan/OneDrive/Desktop/Resources/words_alpha.txt"));

        var randomIndex = (int) (Math.random() * words.size());
        var randomWord = words.get(randomIndex);

        ArrayList<String> list = new ArrayList<>();
        list.add(randomWord);


        ArrayList<String> playerGuesses = new ArrayList<>();

        int wrongCount = 0;
        String keepPlaying = "";

        while (true) {

            printHangedMan(wrongCount);

            if (wrongCount >= 6) {
                System.out.println("You Lose");
                System.out.println("Word was " + randomWord);
                System.out.println();
                System.out.println();
                System.out.println("Would you like to play again? (y or n)");
                try {
                    keepPlaying = keyboard.next();
                } catch (InputMismatchException k) {
                    System.out.println("Due to Exception in keepPlaying after you lose" + k);
                    keyboard.next();
                }
                if (keepPlaying.equals("n")) {
                    System.exit(0);
                } else if (keepPlaying.equals("y")) {
                    printHangedMan(wrongCount = 0);
                }
            }

            if (!getPlayerGuesses(keyboard, playerGuesses, randomWord)) {
                wrongCount++;
                System.out.println("Nope! Try again.");
                printWordState(randomWord, playerGuesses);
            } else {
                printWordState(randomWord, playerGuesses);
            }

        }

    }
}
