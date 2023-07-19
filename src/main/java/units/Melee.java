package units;
import java.util.*;

public abstract class Melee extends Person {
    protected int attacksAmount, attackRange;
    public Melee(int x, int y, int initiative, int damage, int moveDistance, int attacksAmount, int attackRange) {
        super(x, y, 100, 100, damage, moveDistance, initiative, true);
        this.attacksAmount = attacksAmount;
        this.attackRange = attackRange;
    }

    @Override
    public void step(ArrayList<Person> enemy, ArrayList<Person> team) {
        if (!isAlive) return;

        Person tmp = nearest(enemy);

        if (coordinates.countDistance(tmp.coordinates) <= attackRange) {
            for (int i = 0; i < attacksAmount; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
        } else {
            move(tmp.coordinates, team);
            state = "Moving";
        }
    }
}


