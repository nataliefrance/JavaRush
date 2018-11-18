package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Иванович", "Фёдор");
        map.put("Петрович", "Фёдор");
        map.put("Васечкин", "Вася");
        map.put("Пупкинович", "Василий");
        map.put("Пупкин", "Святослав");
        map.put("Иванова", "Ивана");
        map.put("Петрова", "Мария");
        map.put("Васечкина", "Мария");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.values())
            if (s.equals(name)) count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.keySet())
            if (s.equals(lastName)) count ++;
        return count;

    }

    public static void main(String[] args) {

    }
}
