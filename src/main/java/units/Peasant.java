package units;
import java.util.*;

public class Peasant extends Support {
    public Peasant(int x, int y, int initiative, int actionPriority) {
        super(x, y, initiative, 0, 0, 1, actionPriority);
    }

    @Override
    public String getInfo() {
        return "Peasant [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp
                + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Person> enemy, ArrayList<Person> team) {
        if (isAlive) {
            if (state == "Busy") {
                state = "Stand";
            }
        }
    }

}

