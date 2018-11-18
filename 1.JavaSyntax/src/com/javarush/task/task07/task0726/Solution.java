package com.javarush.task.task07.task0726;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i%4==0) {
                int age = Integer.parseInt(list.get(i + 1));
                int weight = Integer.parseInt(list.get(i + 2));
                int taillenght = Integer.parseInt(list.get(i + 3));
                Cat cat = new Cat(list.get(i), age, weight, taillenght);
                CATS.add(cat);
            }
        }


        printList();
    }

    public static void printList() {
        for (Cat CAT : CATS) {
            System.out.println(CAT);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}


