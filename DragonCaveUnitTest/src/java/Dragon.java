import java.util.Scanner;

public class Dragon {

    public String intro() {
        return "Welcome to Dragon Cave";
    }

    public String promptUser(){
        return "Please pick 1 or 2";
    }

    public String death() {
        return "You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!";
    }

    public String alive() {
        return "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "You see flickering light in the distance and hear wood clunking on damp stone.\n" +
                "There is a hunched over round figure approaching you.\n" +
                "Someone shouts, 'Who goes there?'";
    }

    public int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }
}
