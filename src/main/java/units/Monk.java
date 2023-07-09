package units;
// Класс Монах, наследуется от базового класса units.Person

public class Monk extends Person {
    public Monk(String name, int x, int y) {
        super(name, 150, 1, 50, 70, new int[]{80,140},
                30, 2, 6, x, y);
    }
    public void castMana(){}

    @Override
    public void getDamage(float damage) {
        curHp -= damage;
        if (curHp >= maxHp) curHp = maxHp;
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }

    @Override
    public String getInfo() {
        return "Монах " + name;
    }


}
