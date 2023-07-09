package units;
// Класс Копейщик, наследуется от базового класса units.Person
public class Swordsman extends Person {
    public Swordsman(String name, int x, int y) {
        super(name, 250, 0, 0, 70, new int[]{100,150},
                80, 8, 8, x, y);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }
    @Override
    public String getInfo() {
        return "Копейщик " + name;
    }


}
