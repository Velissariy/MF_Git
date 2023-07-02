import units.Person;
import units.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> team1 = new ArrayList<>();
        ArrayList<Person> team2 = new ArrayList<>();
        for (int i =0; i < 20; i++){
            int val = new Random().nextInt(14);
            switch (val) {
                case 0 -> team1.add(new Mage( getName()));
                case 1 -> team1.add(new Crossbowman( getName()));
                case 2 -> team1.add(new Monk( getName()));
                case 3 -> team1.add(new Peasant( getName()));
                case 4 -> team1.add(new Rogue( getName()));
                case 5 -> team1.add(new Sniper( getName()));
                case 6 -> team1.add(new Swordsman( getName()));
                case 7 -> team2.add(new Mage( getName()));
                case 8 -> team2.add(new Crossbowman( getName()));
                case 9 -> team2.add(new Monk( getName()));
                case 10 -> team2.add(new Peasant( getName()));
                case 11 -> team2.add(new Rogue( getName()));
                case 12 -> team2.add(new Sniper( getName()));
                case 13 -> team2.add(new Swordsman( getName()));

            }
        }
            team1.get(0).getInfo();
            System.out.println("team 1");
            team1.forEach(n-> System.out.println(n.getInfo()));
            System.out.println("team 2");
            team2.get(0).getInfo();
            team2.forEach(n-> System.out.println(n.getInfo()));
        }

    protected static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;

    }
}
