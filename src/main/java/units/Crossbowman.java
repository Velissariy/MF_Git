package units;

// Класс Арбалетчик, наследуется от базового класса units.Person
public class Crossbowman extends Person {
    public Crossbowman(String name) {
        super(name, 100, 0, 0, 80,
                new int[]{70,120}, 45, 2, 8);
    }

    public void fire(){}

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}
