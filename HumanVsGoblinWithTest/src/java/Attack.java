import java.util.InputMismatchException;
import java.util.Scanner;

public class Attack {
    static Map map = new Map(10);
    public static Scanner scanner = new Scanner(System.in);
    static Human player1 = new Human();
    static Goblin com = new Goblin();

    public static void movement(Scanner wasd) {
        System.out.println("Please move your character around the land with: W/A/S/D");
        map.addEntity(player1);
        map.addEntity(com);
        map.updateState();
        System.out.println(map);
        do {
            try {
                char c = wasd.next().charAt(0);
                switch (c) {
                    case 'w':
                        Human.moveW();
                        map.updateState();
                        System.out.println(map);
                        break;
                    case 'a':
                        Human.moveA();
                        map.updateState();
                        System.out.println(map);
                        break;
                    case 's':
                        Human.moveS();
                        map.updateState();
                        System.out.println(map);
                        break;
                    case 'd':
                        Human.moveD();
                        map.updateState();
                        System.out.println(map);
                        break;
                    default:
                        System.out.println("Wrong movement key. Use W/A/S/D");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input in class Attack under movement method " + e);
            }
        } while (!getLocation(com, player1));
        combat();

    }

    private static boolean getLocation(Goblin goblin, Human human) {
        int x = goblin.getX();
        int y = goblin.getY();
        int z = x + y;
        int a = human.getX();
        int b = human.getY();
        int c = a + b;
        return (z == c);
    }

    private static void combat() {
        int random_Int = (int) Math.floor(Math.random() * (player1.getHealth() - com.getStrength()));
        player1.setHealth(player1.getHealth() - com.getStrength());
        if (random_Int <= com.getHealth()) {
            System.out.println("Goblin got hit for " + player1.strength + ". Goblin had died. You win.");
        } else {
            System.out.println("Player1 got hit for " + com.strength + ". Player1 has died. You lose.");
        }
    }

}
