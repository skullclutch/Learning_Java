public class Humanoid extends Attack {
    int x;
    int y;


    public Humanoid() {

    }

    public Humanoid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
