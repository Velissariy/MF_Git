package units;
import java.util.*;

public class Mage extends Support {
    public Mage( int x, int y, int initiative,int actionPriority) {
        super( x, y, +2, 100,10,3,
    actionPriority);
    }
    @Override
    public String getInfo() {
        return "Mage [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 10 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Person> enemy, ArrayList<Person> team) {

        super.step(enemy, team);
        ArrayList<Person> deadTeammates = new ArrayList<>();
        Person tmpAlly = team.get(0);
        if (!isAlive) return;
        for (Person unit: team) {
            if (!unit.isAlive) {
                deadTeammates.add(unit);
            }
        }
        if (deadTeammates.size() > team.size() / 2 - 1 && mana >= 5) {
            int rand = new Random().nextInt(deadTeammates.size() - 1);

                    deadTeammates.get(rand).isAlive = true;
                    deadTeammates.get(rand).hp = deadTeammates.get(rand).max_hp / 2;
                    //tmpAlly.state = "Revived";
                    state = "Revive";
                    mana = 0;
                    return;



        }
    }
}

