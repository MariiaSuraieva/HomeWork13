package com.hillel.suraieva.homework13;

public class Fitness {
    private String name;
    String surname;
    private String dayBirth;
    private String monthBirth;
    private int yearBirth;
    private String emeil;
    private String telefon;
    double ves;
    String davlenie;
    int kolSteps;
    private int age;

    public Fitness(String name, String surname, String dayBirth, String monthBirth, int yearBirth, String emeil, String telefon, double ves, String davlenie, int kolSteps) {
        this.name = name;
        this.surname = surname;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.emeil = emeil;
        this.telefon = telefon;
        this.ves = ves;
        this.davlenie = davlenie;
        this.kolSteps = kolSteps;

    }

    public int getAge() {
        age = 2020 - this.yearBirth;
        return age;
    }

    public void printAccountInfo() {
        System.out.println("------------Accounts parametres------------" + "\n" +
                "name = " + name + "\n" +
                "surname = " + surname + "\n" +
                "Birth = " + dayBirth + '.' + monthBirth + '.' + yearBirth + "\n" +
                "emeil = " + emeil + "\n" +
                "telefon = " + telefon + "\n" +
                "ves = " + ves + "\n" +
                "davlenie = " + davlenie + "\n" +
                "kolSteps = " + kolSteps + "\n" +
                "age = " + getAge());
        System.out.println();
    }


}
