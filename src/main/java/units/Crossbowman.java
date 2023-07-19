package units;
import java.util.*;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y, int initiative) {
        super(x, y, initiative + 3, 5, 20, 0);
    }

    public void fire(){}

    @Override
    public String getInfo() {
        return "Crossbowman [" + coordinates.x + ", " + coordinates.y + "] arrows: " + arrows
                + " HP: " + hp + "/" + max_hp + " " + state;
    }
}
