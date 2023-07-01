
// Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//  На базе описания персонажей описать простейшую иерархию классов.
//  В основной программе создать по одному экземпляру каждого класса.

// Базовый класс персонажа
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Персонаж: " + name);
    }
}

// Класс Маг, наследуется от базового класса Person
class Mage extends Person {
    private int spellPower;

    public Mage(String name, int spellPower) {
        super(name);
        this.spellPower = spellPower;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Маг");
        System.out.println("Сила заклинаний: " + spellPower);
    }
}

// Класс Монах, наследуется от базового класса Person

class Monk extends Person {
    private int agility;

    public Monk(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Монах");
        System.out.println("Ловкость: " + agility);
    }
}

// Класс Разбойник, наследуется от базового класса Person

class Rogue extends Person {
    private int trick;

    public Rogue(String name, int trick) {
        super(name);
        this.trick = trick;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Разбойник");
        System.out.println("Хитрость: " + trick);
    }
}

// Класс Копейщик, наследуется от базового класса Person
class Swordsman extends Person {
    private int strength;

    public Swordsman(String name, int strength) {
        super(name);
        this.strength = strength;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Копейщик");
        System.out.println("Сила: " + strength);
    }
}

// Класс Снайпер, наследуется от базового класса Person

class Sniper extends Person {
    private int agility;

    public Sniper(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Снайпер");
        System.out.println("Ловкость: " + agility);
    }
}

// Класс Арбалетчик, наследуется от базового класса Person

class Crossbowman extends Person {
    private int agility;

    public Crossbowman(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Арбалетчик");
        System.out.println("Ловкость: " + agility);
    }
}

// Класс Крестьянин, наследуется от базового класса Person

class Peasant extends Person {
    private int modjo;

    public Peasant(String name, int modjo) {
        super(name);
        this.modjo = modjo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Класс: Крестьянин");
        System.out.println("Моджо: " + modjo);
    }
}


public class Homework_1 {
    public static void main(String[] args) {
        Mage mage = new Mage("Урфин Джус", 70);
        mage.display();

        Monk monk = new Monk("Шао ли", 55);
        monk.display();

        Rogue rogue = new Rogue("Тристан", 60);
        rogue.display();

        Swordsman swordsman = new Swordsman("Элиот Каплански", 60);
        swordsman.display();

        Sniper sniper = new Sniper("Стрелок", 70);
        sniper.display();

        Crossbowman crossbowman = new Crossbowman("Ароу", 90);
        crossbowman.display();

        Peasant peasant = new Peasant("Остин", 100);
        peasant.display();


    }
}