package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        //
        Iterator<Cat> iterator = cats.iterator();

        Cat next = iterator.next();
        cats.remove(next);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> newSet = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        newSet.add(cat1);
        newSet.add(cat2);
        newSet.add(cat3);
        return newSet;
    }

    public static void printCats(Set<Cat> cats) {
        //Iterator<Cat> iterator = set.iterator();
        //while (iterator.hasNext())
        // step 4 - пункт 4
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
    
    public static class Cat{
        Cat (){

        }
    }
    // step 1 - пункт 1
}
