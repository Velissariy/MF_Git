package units;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

// Класс Арбалетчик, наследуется от базового класса units.Person
public class Crossbowman extends Person {
    public Crossbowman(String name, int x, int y) {
        super(name, 100, 0, 0, 80,
                new int[]{70,120}, 45, 2, 8, x, y);
    }

    public void fire(){}

    @Override
    public void step() {
        Characters tmp = nearest(ArrayList<Person> units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        public void step(ArrayList<Person> units, ArrayList<Person> team) {
            // Если жизни 0 вернуть управление
            if (this.hp == 0 || this.arrows == 0) return;
            // Если стрел 0 вернуть управление
            // Найти ближайшего противника
            Person tmp = nearest(units);
            // Нанести ему среднее повреждение

            for (Person unit:team) {
                if (unit.name.equals("Peasant")) {
                    arrows++;
                    break;
                }
            }
            tmp.HP_damage(this.damage);
            // уменьшить кол-во стрел на одну и вернуть управление
            arrows -= 1;
            return;
        }
        }

    @Override
    public Person nearest(ArrayList<Person> units) {
        return super.nearest(units);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}
