package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей
        Human children1 = new Human("Lena", 18, false);
        Human children2 = new Human("Natasha", 14, false);
        Human children3 = new Human("Sharik", 10, true);
        ArrayList<Human> children = new ArrayList<>();
        children.add(children1);
        children.add(children2);
        children.add(children3);
        Human Father = new Human("Emil", 42, true, children);
        Human Mother = new Human("Sveta", 40, false, children);
        Human grandpa1 = new Human("Abram", 65, true, new ArrayList<>(Arrays.asList(Father)));
        Human grandma1 = new Human("Elena", 63, false, new ArrayList<>(Arrays.asList(Father)));
        Human grandpa2 = new Human("Petr", 68, true, new ArrayList<>(Arrays.asList(Mother)));
        Human grandma2 = new Human("Ekaterina", 64, false, new ArrayList<>(Arrays.asList(Mother)));

        ArrayList<Human> humans = new ArrayList<>(Arrays.asList(grandma1, grandma2, grandpa1, grandpa2, Mother, Father, children1, children2, children3));
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
    }

    public static class Human {
        //имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>)
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;

        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public Human(String name, int age, boolean sex) {
            this(name, age, sex, new ArrayList<>());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
