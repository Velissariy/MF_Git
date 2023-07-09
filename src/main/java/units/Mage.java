package units;
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

//    @Override
//    public String getInfo() {
//        return "Маг " + name;
//    }


}

