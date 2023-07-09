package units;
import java.util.*;

    // Базовый класс персонажа
public abstract class Person implements InGameInterface{

        protected String name;

        protected float maxHp, curHp;
        protected int mana;
        protected int agility;
        protected int[] damage;
        protected int defense;
        protected int initiave;
        protected int actionPoints;
        protected boolean hasAP(){
            if (actionPoints>0){
                return true;
            }else return false;
        }
        protected int haveMagic;
        protected boolean hashM(){
             if (haveMagic>0){
                 return true;
             }else return false;
        }

        protected Coordinates coordinates;

        public Person(String name, float maxHp, int haveMagic,
                      int mana, int agility, int [] damage,
                      int defense,int initiave, int actionPoints, int x, int y) {
            this.name = name;
            this.maxHp = this.curHp = maxHp;
            this.mana = mana;
            this.agility = agility;
            this.damage = damage;
            this.defense = defense;
            this.initiave = initiave;
            this.actionPoints = actionPoints;
            this.haveMagic = haveMagic;
            coordinates = new Coordinates(x, y);
        }

        //        public int move(){
//            while(hasAP()) {
//            }
//        }
        public void display() {
            System.out.println("Персонаж: " + name);
            System.out.println("Количество жизней: " + maxHp);
            if (haveMagic > 0) {System.out.println("Количество маны: " + mana);}
            else System.out.println("Не обладает магией");
            System.out.println("Величина ловкости: " + agility);
            System.out.println("Урон: " + Arrays.toString(damage));
            System.out.println("Защита: " + defense);
            System.out.println("Инициатива: " + initiave);
            System.out.println("Очки действий: " + actionPoints);

        }

//        public String getName() {
//            Random random = new Random();
//            Name[] names = Name.values();
//            int index = random.nextInt(names.length);
//            return names[index].toString();
//        }


        public void getDamage(float damage){
             curHp -= damage;
        }

        @Override
        public void step() {
            System.out.println(name + " двигается.");
        }



        @Override
        public String getInfo() {
//                Random random = new Random();
//                Name[] names = Name.values();
//                int index = random.nextInt(names.length);
//                return names[index].toString();
//            return String.format("name:%s hp:%d", name, hp);
            return name;
        }
        public Person nearest(ArrayList<Person> units) {
            double nearestDistance = Double.MAX_VALUE;
            Person nearestEnemy = null;
            for (int i = 0; i < units.size(); i++) {
                if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                    nearestEnemy = units.get(i);
                    nearestDistance = coordinates.countDistance(units.get(i).coordinates);
                }
            }
            return nearestEnemy;
        }
//        public void HP_damage(int damage) {
//            hp -= damage;
//            if (hp < 0) hp = 0;
//            if (hp > max_hp) hp = max_hp;
//        }
}


