package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put(city, family);
        }

        String s = reader.readLine();
        System.out.println(map.get(s));

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());

        //if (0 <= houseNumber && houseNumber < addresses.size()) {
        //    String familySecondName = addresses.get(houseNumber);
        //    System.out.println(familySecondName);
        //}
    }
}
