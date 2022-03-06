public class Goblin extends Humanoid {
    public int health = 75;
    public int strength = 65;


    public Goblin() {
        super(4, 3);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC7A";
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
}