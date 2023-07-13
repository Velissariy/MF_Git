package units;
// Класс Крестьянин, наследуется от базового класса units.Person

public class Peasant extends Person {
    public Peasant(String name, int x, int y) {
        super(name, 80, 0, 0, 30, new int[]{0,0},
                30, 1, 10, x, y);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name;
    }

    @Override
    public void step(ArrayList<Person> units, ArrayList<Person> team) {
        Person tmp = nearest(units);

}

