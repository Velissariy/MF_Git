package units;// Класс Разбойник, наследуется от базового класса units.Person

public class Rogue extends Person {
    public Rogue(String name) {
        super(name, 130, 0, 0, 100, new int[]{50,110},
                20, 8, 10);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Бродяга " + name;
    }


}
