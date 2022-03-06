public class Terrain {
    private int x;
    private int y;
    private String state;

    public Terrain(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setState(String str) {
        this.state = str;
    }

    @Override
    public String toString() {
        return state;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
