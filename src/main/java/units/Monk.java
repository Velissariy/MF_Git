package units;// Класс Монах, наследуется от базового класса Characters.Person

public class Monk extends Person {
    public Monk(String name) {
        super(name, 150, 1, 50, 70, new int[]{80,140},
                30, 2, 6);
    }
}
