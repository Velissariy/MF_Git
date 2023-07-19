package units;

import java.util.*;

public interface InGameInterface {

    void step(ArrayList<Person> team1, ArrayList<Person> team2);
    String getInfo();
}
