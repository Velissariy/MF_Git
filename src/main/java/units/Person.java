package units;
import java.util.*;
// Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//  На базе описания персонажей описать простейшую иерархию классов.
//  В основной программе создать по одному экземпляру каждого класса.
interface Hero {
    void step();
    String getInfo();
}
    // Базовый класс персонажа
public abstract class Person {

        public String name;
        public float maxHp, curHp;
        public int mana;
        public int agility;
        public int[] damage;
        public int defense;
        public int initiave;
        public int actionPoints;
        public boolean hasAP(){
            if (actionPoints>0){
                return true;
            }else return false;
        }
         public int haveMagic;
         public boolean hashM(){
             if (haveMagic>0){
                 return true;
             }else return false;
        }

        public Person(String name, float maxHp, int haveMagic,
                      int mana, int agility, int [] damage,
                      int defense,int initiave, int actionPoints) {
            this.name = name;
            this.maxHp = this.curHp = maxHp;
            this.mana = mana;
            this.agility = agility;
            this.damage = damage;
            this.defense = defense;
            this.initiave = initiave;
            this.actionPoints = actionPoints;
            this.haveMagic = haveMagic;
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
}


















