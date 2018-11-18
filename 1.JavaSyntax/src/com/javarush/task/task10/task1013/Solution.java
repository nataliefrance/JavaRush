package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int weight;
        private String name;
        private boolean sex;
        private String skill;
        private int levelOfSkill;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, String name) {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public Human(int age, int weight, String name, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, int weight, String name, boolean sex, String skill) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
            this.skill = skill;
        }

        public Human(int age, int weight, String name, boolean sex, String skill, int levelOfSkill) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
            this.skill = skill;
            this.levelOfSkill = levelOfSkill;
        }

        public Human(int age, String name, boolean sex) {
            this.age = age;
            this.name = name;
            this.sex = sex;

        }

        public Human(int age, String name, boolean sex, String skill, int levelOfSkill) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.skill = skill;
            this.levelOfSkill = levelOfSkill;
        }

        public Human(String name, String skill, int levelOfSkill) {
            this.name = name;
            this.skill = skill;
            this.levelOfSkill = levelOfSkill;
        }

        public Human(String name, boolean sex, String skill, int levelOfSkill) {
            this.name = name;
            this.sex = sex;
            this.skill = skill;
            this.levelOfSkill = levelOfSkill;
        }


        // напишите тут ваши переменные и конструкторы
    }
}
