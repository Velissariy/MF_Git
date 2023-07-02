package units;
// Класс Крестьянин, наследуется от базового класса Person

public class Peasant extends Person {
    public Peasant(String name) {
        super(name, 80, 0, 0, 30, new int[]{0,0},
                30, 1, 10);
    }
}

