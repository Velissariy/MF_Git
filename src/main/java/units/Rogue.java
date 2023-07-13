package units;// Класс Разбойник, наследуется от базового класса units.Person

public class Rogue extends Person {
    public Rogue(String name, int x, int y) {
        super(name, 130, 0, 0, 100, new int[]{50,110},
                20, 8, 10, x, y);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Бродяга " + name;
    }

    @Override
    public void step(ArrayList<Person> units, ArrayList<Person> team) {
        Person tmp = nearest(units);


}
