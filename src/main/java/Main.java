import units.Person;
import units.Names;
import units.*;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Main {
    public static ArrayList<Person> team1 = new ArrayList<>();
    public static ArrayList<Person> team2 = new ArrayList<>();
    public static ArrayList<Person> allteams = new ArrayList<>();

    public static void main(String[] args) {

//        list.add(new Mage(getName(Names.getRandomName()), 0,1));
//        list.add(new Crossbowman(getName(),0,2));
//        list.add(new Peasant(name,0,3));
//        list.add(new Swordsman(getName(),0,4));
//        list.add(new Monk( getName(),0,5));
//        list.add(new Rogue( getName(),0,6));
//        list.add(new Sniper( getName(),0,7));


        int teamCount = 10;
        System.out.println("team 1");
        Random rand = new Random();
        ArrayList<Person> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount + 1; i++) {
            int val = rand.nextInt(5) + 1;
            switch (val) {
                case 0:
                    team1.add(new Mage(Names.Sigma.getRandomName(), 0, 1));
                    break;
                case 1:
                    team1.add(new Crossbowman(Names.Gugenot.getRandomName(), 0, 2));
                    break;
                case 2:
                    team1.add(new Peasant(Names.Johny.getRandomName(), 0, 3));
                    break;
                case 3:
                    team1.add(new Swordsman(Names.imperator_Zorg.getRandomName(), 0, 4));
            }


            ArrayList<Person> team2 = new ArrayList<>();
            System.out.println("team 2");
            for (int j = 0; j < teamCount; j++) {
                int val1 = rand.nextInt(teamCount);
                switch (val) {
                    case 0:
                        team2.add(new Monk(Names.Urfin.getRandomName(), 0, val1 + 1));
                        break;
                    case 1:
                        team2.add(new Peasant(Names.Shaoutt.getRandomName(), 0, val1 + 1));
                        break;
                    case 2:
                        team2.add(new Rogue(Names.Sharon.getRandomName(), 0, val1 + 1));
                        break;
                    case 3:
                        team2.add(new Sniper(Names.Bob.getRandomName(), 0, val1 + 1));


                }
                System.out.println(team2.get(i).getInfo());
            }
            allteams.addAll(team1);
            allteams.addAll(team2);

        }


    }
    Scanner in = new Scanner(System.in);
        while(true) {
        View.view();
        in.nextLine();
        for (Person avengers : allteams) {
            if (team2.contains(avengers)) avengers.step(team1, team2);
            else avengers.step(team2, team1);
        }
        if (isTeamDie(team1)) {
            System.out.println("Team 2 (Blue) win");
            break;
        }
        if (isTeamDie(team2)) {
            System.out.println(("Team 1 (Green) win"));
            break;
        }
    }

    static boolean isTeamDie(ArrayList<Person> team) {
        for (Person person: team) {
            if (!person.equals("dead")) return false;
        }
        return true;
    }
}
