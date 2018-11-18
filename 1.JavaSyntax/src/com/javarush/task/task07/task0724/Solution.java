package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //4 объекта без отца и матери и 5 объектов с ними)
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Masha", false, 73 );
        Human human2 = new Human("Marusya", false, 32 );
        Human human3 = new Human("IGOR", true, 3 );
        Human human4 = new Human("Mitrofan", true, 70 );
        Human human11 = new Human("Kesha", true, 55, human4, human1);
        Human human12 = new Human("Petr", true, 5, human3, human2);
        Human human13 = new Human("Marfa", false, 25, human12, human1);
        Human human14 = new Human("Gena", true, 15, human11, human13);
        Human human15 = new Human("Kalina", false, 36, human14, human13);

        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human11);
        humans.add(human12);
        humans.add(human13);
        humans.add(human14);
        humans.add(human15);
        for(int i = 0; i<humans.size(); i++){
            System.out.println(humans.get(i));
        }
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















