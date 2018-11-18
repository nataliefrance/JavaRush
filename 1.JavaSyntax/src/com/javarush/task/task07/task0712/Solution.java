package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String minimum = null;
        String maximum = null;
        int indexMin = 0;
        int indexMax = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maximum = list.get(i);
                indexMax = i;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < min){
                min = list.get(i).length();
                minimum = list.get(i);
                indexMin = i;}
        }
        if (indexMax < indexMin)
            System.out.println(maximum);
        else System.out.println(minimum);
        //напишите тут ваш код
    }
}
