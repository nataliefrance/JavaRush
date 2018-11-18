package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> newHashMap = new HashMap<>();
        newHashMap.put("Ivanov1", 450);
        newHashMap.put("Ivanov2", 500);
        newHashMap.put("Ivanov3", 600);
        newHashMap.put("Ivanov4", 600);
        newHashMap.put("Ivanov5", 700);
        newHashMap.put("Ivanov6", 800);
        newHashMap.put("Ivanov7", 300);
        newHashMap.put("Ivanov8", 0);
        newHashMap.put("Ivanov9", 3);
        newHashMap.put("Ivanov10", 20000);
        return newHashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {

//        HashMap <String, Integer> map = createMap();
//        removeItemFromMap(map);
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            //получение «пары» элементов
//            Map.Entry<String, Integer> pair = iterator.next();
//            String key = pair.getKey();            //ключ
//            Integer value = pair.getValue();        //значение
//            System.out.println(key + "-" + value);
//        }
    }
}