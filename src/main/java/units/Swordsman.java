package units;
import java.util.*;

public class Swordsman extends Melee {
    public Swordsman(int x, int y, int initiative) {
        super(x, y, initiative + 4, 10, 1, 1, 2);
    }

    @Override
    public String getInfo() {
        return "Lancer [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }


}
