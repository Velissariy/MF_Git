package units;
// Класс Снайпер, наследуется от базового класса units.Person

public class Sniper extends Person {
    public Sniper(String name) {
        super(name, 120, 0, 0, 120,  new int[]{110,180},
                10, 4, 5);
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Стрелок " + name;
    }


}
