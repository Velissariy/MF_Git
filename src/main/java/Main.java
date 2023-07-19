//import units.Person;
//import units.Names;
import units.*;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Main {
    public static ArrayList<Person> team1 = new ArrayList<>();
    public static ArrayList<Person> team2 = new ArrayList<>();
    public static ArrayList<Person> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamCount = 10;
        boolean sortedInitiative = false;
        Random rand = new Random();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            addRandomUnit(val, i, team1, 1);
            val = rand.nextInt(7);
            addRandomUnit(val, i, team2, 10);
        }
        while (!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team1.size() - 1; i++) {
                if (team1.get(i).initiative < team1.get(i + 1).initiative) {
                    Collections.swap(team1, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        View.view();
        Scanner in = new Scanner(System.in);
        while (true) {
            in.nextLine();
            String message = " ";
            int init1 = 0, init2 = 0;
            Person tmpTeam1 = team1.get(init1);
            Person tmpTeam2 = team2.get(init2);

            for (int i = 0; i < teamCount * 2; i++) {
                if (isTeamDie(team1)) {
                    message = "Team 2 win!";
                    break;
                }
                if (isTeamDie(team2)) {
                    message = "Team 1 win!";
                    break;
                }
                if ((tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10) || (tmpTeam1.initiative < tmpTeam2.initiative && init2 == 10)) {
                    tmpTeam1.step(team2, team1);
                    init1++;
                    if (init1 < 10) tmpTeam1 = team1.get(init1);
                } else {
                    tmpTeam2.step(team1, team2);
                    init2++;
                    if (init2 < 10) tmpTeam2 = team2.get(init2);
                }
            }
            View.view();

            if (message.equals("Team 2 win!") || message.equals("Team 1 win")) {
                System.out.println(message);
                break;
            }
        }
    }
    public static boolean isTeamDie(ArrayList<Person> team) {
        for (Person avengers : team) {
            if (!avengers.state.equals("Dead")) return false;
        }
        return true;
    }
    private static void addRandomUnit(int num, int i, ArrayList<Person> units, int teamPos) {
        Random rand = new Random();
        switch (num)
        {
            case 0:
                units.add(new Sniper(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 1:
                units.add(new Crossbowman(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 2:
                units.add(new Mage(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 3:
                units.add(new Monk(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 4:
                units.add(new Peasant(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 5:
                units.add(new Rogue(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 6:
                units.add(new Swordsman(teamPos, i + 1, rand.nextInt(21)));
                break;
        }
    }
}




