import java.lang.System;
import java.util.*;
public class Main {

    public static void compareNum(int randNum, int userNum) {
        if(userNum < randNum){
            System.out.println("Your guess is too low.");
//            System.out.println("Take a guess");
        }else if(userNum > randNum) {
            System.out.println("Your guess is too high.");
//            System.out.println("Take a guess");
        }
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        int number = 1 + (int) (20*Math.random());//generates the random number 1-20


        int number;
        int guess;
        char keepPlaying;
        int attempt;



        System.out.println("Hello! What is your name?");
        String name = sc.nextLine();

        System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.");
//        System.out.println("Take a guess.");


        // outer loop for running mult games
        do {
            guess = 0;

            number = 1 + (int) (20 * Math.random());//generates the random number 1-20
            System.out.println("Take a guess.");


            do {
                guess++;
//                try {
                     attempt = sc.nextInt();
//                }catch(Exception e){
//                    System.out.println("Improper Type.");
//                }
                if (number == attempt) {
                    System.out.println("Good job, " + name + " ! You guessed my number in " + guess + " guesses!");
                    break;
                } else {
                    compareNum(number, attempt);
                }
            } while (guess < 7);

            if(guess >= 7){
                System.out.println("You've used all your attempts.");
            }



//            System.out.println("You have ran out of attempts to guess the correct number.");
//            System.out.println("The number was " + number + ".");
            System.out.println();
            System.out.println("Would you like to play again? (y or n)");
            keepPlaying = sc.next().charAt(0);
//            System.out.println(keepPlaying);
        }while (keepPlaying != 'n');

    }

}
