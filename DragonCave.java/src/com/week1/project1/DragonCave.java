package com.week1.project1;

import java.util.Scanner;

public class DragonCave {

    public static Scanner in = new Scanner(System.in);


    public static String scanStr() {
        return in.nextLine();
    }


    public static void userName() {
        String usernm = "";
        System.out.println("Enter what you are called");
        try {
            usernm = String.valueOf(scanStr());
        } catch (Exception e) {
            System.out.println("Wrong Input. Exception in userName.");
            in.next();
        }
        System.out.println("You shout back, 'My name is " + usernm + "'");
        System.out.println("The old man hobbles forward. You see that it's no one other than Master Roshi himself!");
        System.out.println("He looks at you, smiles and says 'Well hello " + usernm + "!");
        System.out.println("Why don't you come in and sit by the fire?'");
        System.out.println("You follow him into the cave and as you get closer to the fire,");
        System.out.println("you see a huge dragon in the back of the cavern and 7 glowing orange balls.");
        System.out.println("Master Roshi looks at you and says," + "'" + usernm + ", I have just summoned this dragon");
        System.out.println("with these dragon balls. He will grant one wish when all 7 dragon balls are present.");
        System.out.println("Seeing that you have made it this far and decided to venture into this cave,");
        System.out.println("I will allow you to make the wish.'");
        System.out.println("You are stunned that this old man would let a stranger use the only wish,");
        System.out.println("but you do not hesitate. You look from the dragon to the dragon balls and back");
        System.out.println("to Master Roshi. You ask him, 'And I can wish for anything?'");
        System.out.println("He smiles and replies, 'Anything that you can imagine.'");
        System.out.println("You nod your head, take a deep breath, look at the dragon and say,");
        System.out.println("'I WISH TO BE THE BEST JAVA PROGRAMMER THAT EVER LIVED!'");
        System.out.println("The dragon looks at you and says with a booming voice so loud,");
        System.out.println("the whole cavern starts to shake.");
        System.out.println("'Your wish shall be granted.'");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CONGRATULATIONS");
        System.out.println("You have been bestowed with the skills of the Best Java Programmer that ever lived!");
        System.out.println("No one will ever be able to out code you!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.exit(0);
    }


    public static int readIntBetween() {
        int input;
        do {
            System.out.println("Which cave will you go into? (1 or 2)");
            try {
                input = Integer.parseInt(scanStr());
                if (input == 1) {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky");
                    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                    System.out.println("Gobbles you down in one bite!");
                    System.exit(0);
                }
                if (input == 2) {
                    System.out.println("You approach the cave...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("You see flickering light in the distance and hear wood clunking on damp stone.");
                    System.out.println("There is a hunched over round figure approaching you.");
                    System.out.println("Someone shouts, 'Who goes there?' ");
                    break;
                }
            } catch (Exception e) {
                input = 0;
                System.out.println("Wrong Input. Exception in readInBetween.");
                in.next();
            }
        } while (input != 1 && input != 2);
        return input;
    }


    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");

        readIntBetween();

        userName();


    }
}




