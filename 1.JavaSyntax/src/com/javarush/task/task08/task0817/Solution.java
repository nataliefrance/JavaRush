package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov1", "Ivan1");
        map.put("Ivanov2", "Ivan3");
        map.put("Ivanov3", "Ivan3");
        map.put("Ivanov4", "Ivan4");
        map.put("Ivanov5", "Ivan5");
        map.put("Ivanov6", "Ivan1");
        map.put("Ivanov7", "Ivan7");
        map.put("Ivanov8", "Ivan8");
        map.put("Ivanov9", "Ivan3");
        map.put("Ivanov10", "Ivan10");


        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        Map<String, String> newMap = new HashMap<>(map);

        Iterator<Map.Entry<String, String>> iterator = newMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            removeItemFromMapByValue(map, value);
        }

        map = newMap;
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        int i = 0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                i++;
            }
        }
        if (i > 1)
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value)) {
                    map.remove(pair.getKey());
                }
            }

    }

    public static void main(String[] args) {
    }
}
