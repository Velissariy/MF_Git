import units.Person;
import units.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//        Monk monk = new Monk(getName());
//        Mage mage = new Mage(getName());
//        System.out.println(
//                mage.getInfo() +
//                        "кастанул магию и получилось"
//                        + Mana.values()[new Random().nextInt(Mana.values().length)].getName());
//
//        ArrayList<Person> list = new ArrayList<>();
//        list.add(new Crossbowman(getName()));
//        list.add(new Monk(getName()));
//        list.get(0).getInfo();
//        list.forEach(n-> System.out.println(n.getInfo()));





    }

    private  static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;

    }
}
