package ru.vorotov.javaexam.e02_Java_Intarface;

interface Eatable{
    int types = 10;
}
class Food implements Eatable {
    static int types = 20;
}
 class Fruit extends Food implements Eatable{  //LINE1

    public static void main(String[] args) {
        types = 30; //LINE 2
        System.out.println(types); //LINE 3
    }
}