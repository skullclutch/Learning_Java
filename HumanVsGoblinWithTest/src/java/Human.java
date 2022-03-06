public class Human extends Humanoid {
    protected int health = 195;
    protected int strength = 75;


    public Human() {
        super(5, 9);
    }

    @Override
    public String toString() {
        return "\uD83D\uDE4E";
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int getHealth() {
        return health;
    }

    protected void setStrength(int strength) {
        this.strength = strength;
    }

    protected int getStrength() {
        return strength;
    }

    public static Human moveW() {
        player1.y -= 1;
        correctMove();
        return player1;
    }

    public static Human moveS() {
        player1.y += 1;
        correctMove();
        return player1;
    }

    public static Human moveA() {
        player1.x -= 1;
        correctMove();
        return player1;
    }

    public static Human moveD() {
        player1.x += 1;
        correctMove();
        return player1;
    }

    public static void correctMove() {
        if (player1.x >= Map.dim) {
            player1.x = Map.dim;
        }
        if (player1.x < 0) {
            player1.x = 0;
        }
        if (player1.y >= Map.dim) {
            player1.y = Map.dim;
        }
        if (player1.y < 0) {
            player1.y = 0;
        }
    }

}
