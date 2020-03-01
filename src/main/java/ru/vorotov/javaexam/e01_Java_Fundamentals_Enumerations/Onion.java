package ru.vorotov.javaexam.e01_Java_Fundamentals_Enumerations;

import java.util.List;

enum Coffee
{
    ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
    public String strength;
    Coffee(String strength)
    {
        this.strength = strength;
    }
    public String toString(){   return strength; }

    public static void main(String[] args) {

        System.out.println(Coffee.ESPRESSO.toString());
        List.of(Coffee.values()).stream();
    }

}

