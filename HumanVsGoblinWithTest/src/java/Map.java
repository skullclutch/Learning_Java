import java.util.ArrayList;
import java.util.stream.IntStream;

public class Map {
    public static int dim = 0;

    class Row {
        ArrayList<Terrain> gameRow = new ArrayList<>();

        public Row(int size, int y) {
            IntStream.range(0, size).forEach(x -> gameRow.add(new Land(x, y)));
        }

        @Override
        public String toString() {
            return String.join(" ", gameRow.stream().map(String::valueOf).toList());
        }
    }

    ArrayList<Row> gameBoard = new ArrayList<>();
    ArrayList<Humanoid> entities = new ArrayList<>();
    ArrayList<Terrain> alteredTerrain = new ArrayList<>();

    public Map addEntity(Humanoid humanoid) {
        entities.add(humanoid);
        return this;
    }

    public Map updateState() {
        entities.forEach(e -> getTerrain(e.y, e.x).setState(e.toString()));
        return this;
    }

    public Map(int d) {
        dim = d;
        IntStream.range(0, d).forEach(y -> gameBoard.add(new Row(d, y)));
    }

    @Override
    public String toString() {
        return String.join("\n", gameBoard.stream().map(String::valueOf).toList());
    }

    public Terrain getTerrain(int x, int y) {
        return gameBoard.get(x).gameRow.get(y);
    }
}
