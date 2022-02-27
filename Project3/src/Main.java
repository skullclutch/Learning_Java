import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static Scanner scanner;

    static {
        try {
            scanner = new Scanner(new File("C:/Rowan/OneDrive/Desktop/Resources/words_alpha.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        List<String> words = new ArrayList<>();

        while (scanner.hasNext()){
            words.add(scanner.nextLine());
        }

        Random rand = new Random();

        String word = words.get(rand.nextInt(words.size()));


        List<Character> playerGuesses = new ArrayList<>();


        Integer wrongCount = 0;
        String keepPlaying = "";
        while(true) {

            printHangedMan(wrongCount);

            if(wrongCount >= 6){
                System.out.println("You Lose");
                System.out.println("Word was "+ word);
                System.out.println();
                System.out.println();
                System.out.println("Would you like to play again? (y or n)");
                try {
                    keepPlaying = keyboard.next();
                }catch(InputMismatchException k){
                    System.out.println("Due to Exception in keepPlaying after you lose" + k);
                    keyboard.next();
                }
                if(keepPlaying.equals("n")) {
                    System.exit(0);
                }

            }


            if (!getPlayerGuesses(keyboard, word, playerGuesses)) {
                wrongCount++;
                System.out.println("Nope! Try again.");
                printWordState(word,playerGuesses);
            } else {
                printWordState(word,playerGuesses);
            }
        }
    }

    public static void printHangedMan(Integer wrongCount) {

        System.out.println(" -------");
        System.out.println(" |     |");
        if (wrongCount >= 1) {
            System.out.println(" O");
        }
        if (wrongCount >= 2) {
            System.out.print("\\ ");
            if (wrongCount >= 3) {
                System.out.println("/");
            } else {
                System.out.println();
            }
        }
        if (wrongCount >= 4) {
            System.out.println(" |");
        }
        if (wrongCount >= 5) {
            System.out.print("/ ");
            if (wrongCount >= 6) {
                System.out.println("\\");
            } else {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    public static boolean getPlayerGuesses(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }

    public static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for(int i = 0; i< word.length(); i++){
            if(playerGuesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        return(word.length() == correctCount);
    }

}

