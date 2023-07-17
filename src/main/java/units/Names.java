package units;

import java.util.Random;

public enum Names {
    Shaoutt , Jordji , Alex , Johny , Bob , Sigma , Bubalech ,
     Boba , imperator_Zorg , Sharon, Gugenot, Yohansson , Urfin , Eliziat , Trueman;


    private String name;

    Names(String name) {this.name = name;}


    public String getName() {
        return name;
    }

    public static String getRandomName() {
        Random random = new Random();
        Names[] names = Names.values();
        int index = random.nextInt(names.length);
        return names[index].toString();
    }
}






