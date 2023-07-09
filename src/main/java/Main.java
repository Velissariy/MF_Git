import units.Person;
import units.*;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Characters> list = new ArrayList<>();
        list.add(new Mage(getName(), 0,1));
        list.add(new Crossbowman(getName(),0,2));
        list.add(new Peasant(getName(),0,3));
        list.add(new Swordsman(getName(),0,4));
        list.add(new Monk( getName(),0,5));
        list.add(new Rogue( getName(),0,6));
        list.add(new Sniper( getName(),0,7));


        System.out.println("team 1");
        int teamCount = 5;
        Random rand = new Random();
        ArrayList<Person> team1 = new ArrayList<>();
        for (int i =0; i < teamCount; i++){
            int val = rand.nextInt(teamCount);
            switch (val) {
                case 0 -> team1.add(new Mage(getName(), 0,1));
                break;
                case 1 -> team1.add(new Crossbowman(getName(),0,2));
                break;
                case 2 -> team1.add(new Peasant(getName(),0,3));
                break;
                case 3 -> team1.add(new Swordsman(getName(),0,4));
            }


        ArrayList<Person> team2 = new ArrayList<>();
            System.out.println("team 2");
        for (int i = 0; i < teamCount; i++){
//            int val = rand.nextInt(teamCount);
            switch (val) {
                case 0 -> team2.add(new Monk( getName(),0,val + 1));
                break;
                case 1 -> team2.add(new Peasant( getName(),0,val + 1));
                break;
                case 2 -> team2.add(new Rogue( getName(),0,val + 1));
                break;
                case 3 -> team2.add(new Sniper( getName(),0,val + 1));


            }
            // System.out.println(team2.get(i).getInfo());
        }
            // System.out.println("The nearest: ");
            System.out.println("Team1: ");
            team1.forEach(n-> System.out.println(n.getInfo()));

            System.out.println("Team2: ");
            team2.forEach(n-> System.out.println(n.getInfo()));

            team1.forEach(n-> n.step(team2, team1));
            team2.forEach(n-> n.step(team1, team2));

            System.out.println("Team1 урон: ");
            team1.forEach(n-> System.out.println(n.getInfo()));

            System.out.println("Team2 урон: ");
            team2.forEach(n-> System.out.println(n.getInfo()));
        }


    }
}
