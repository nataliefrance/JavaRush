package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                String s = reader.readLine();
                list.add(Integer.parseInt(s));
                if (s.isEmpty()) {
                    break;
                }
            }
        } catch (NumberFormatException ex) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //напишите тут ваш код

    }
}
