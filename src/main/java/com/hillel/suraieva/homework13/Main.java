package com.hillel.suraieva.homework13;

public class Main {
    public static void main(String[] args) {
        Fitness client1 = new Fitness("Alena", "Suraieva", "2", "06", 1990, "alsuraieva@ukr.net", "0936789809", 65, "120/70", 3456);
        Fitness client2 = new Fitness("Volodymyr", "Suraiev", "26", "06", 1986, "vovasuraiev@ukr.net", "0933457689", 98, "160/80", 2657);
        Fitness client3 = new Fitness("Kiril", "Figov", "15", "08", 1966, "kfigova@ukr.net", "0678651423", 78, "110/60", 2560);

        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();

        client1.ves = 63.5;
        client1.davlenie = "130/65";
        client1.kolSteps = 6578;
        client3.kolSteps = 4520;
        client3.ves = 68.1;

        client1.printAccountInfo();
        client3.printAccountInfo();


    }
}
