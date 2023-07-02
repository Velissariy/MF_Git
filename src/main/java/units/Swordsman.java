package units;

// Класс Копейщик, наследуется от базового класса Characters.Person
public class Swordsman extends Person {
    public Swordsman(String name) {
        super(name, 250, 0, 0, 70, new int[]{100,150},
                80, 8, 8);
    }
}
