import java.util.*;
//Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
//Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
//Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров наследников BaseHero.
//Удалить ненужные методы из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у всех персонажей getInfo.

interface Hero {
    void step();
    String getInfo();
}

abstract class BaseHero implements Hero {
    protected String name;

    public BaseHero(String name) {
        this.name = name;
    }

    @Override
    public void step() {
        System.out.println(name + " двигается.");
    }
}

class Mage extends BaseHero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "Маг";
    }
}

class Monk extends BaseHero {
    public Monk(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "Монах";
    }
}

public class Homework_2 {
    public static void main(String[] args) {
        List<BaseHero> heroesList1 = new ArrayList<>();
        List<BaseHero> heroesList2 = new ArrayList<>();

        // Добавление 10 случайных экземпляров класса Mage в список heroesList1
        for (int i = 0; i < 10; i++) {
            heroesList1.add(new Mage("Маг " + i));
        }

        // Добавление 10 случайных экземпляров класса Monk в список heroesList2
        for (int i = 0; i < 10; i++) {
            heroesList2.add(new Monk("Монах " + i));
        }

        // Вывод информации о персонажах из списка heroesList1
        for (BaseHero hero : heroesList1) {
            System.out.println(hero.getInfo());
        }

        // Вывод информации о персонажах из списка heroesList2
        for (BaseHero hero : heroesList2) {
            System.out.println(hero.getInfo());
        }
    }
}

