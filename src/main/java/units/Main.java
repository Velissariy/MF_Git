package units;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Урфин Джус");
        mage.display();

        Monk monk = new Monk("Шао ли");
        monk.display();

        Rogue rogue = new Rogue("Тристан");
        rogue.display();

        Swordsman swordsman = new Swordsman("Элиот Каплански");
        swordsman.display();

        Sniper sniper = new Sniper("Стрелок");
        sniper.display();

        Crossbowman crossbowman = new Crossbowman("Ароу" );
        crossbowman.display();

        Peasant peasant = new Peasant("Остин");
        peasant.display();

    }
}
