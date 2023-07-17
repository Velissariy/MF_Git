package units;
import java.util.*;
// Класс Маг, наследуется от базового класса units.Person
public class Mage extends Person {
    public Mage(String name, int x, int y) {
        super(name, 70, 1, 100, 50, new int[]{70,120},
                45, 4, 8, x, y);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public void step(ArrayList<Person> units, ArrayList<Person> team) {
        if (!state.equals("dead")) {
            float min_XP = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < team.size(); i++) {
                if ((float) (team.get(i).hp / max_hp) < min_XP) {
                    min_XP = (float) (team.get(i).hp / max_hp);
                    index = i;
                }
            }
            team.get(index).HP_damage(this.damage);
        }

//    @Override
//    public String getInfo() {
//        return "Маг " + name;
//    }


}

