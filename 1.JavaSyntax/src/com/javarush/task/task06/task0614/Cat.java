package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat[] c = new Cat[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Cat();
            cats.add(c[i]);
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i));
        }
        //напишите тут ваш код
    }
}
