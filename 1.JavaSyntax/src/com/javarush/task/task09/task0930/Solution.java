package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> indexOfNumbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> indexOfStrings = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers.add(Integer.parseInt(array[i]));
                indexOfNumbers.add(i);
            } else {
                strings.add(array[i]);
                indexOfStrings.add(i);
            }
        }
        for (int i = numbers.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(j) < numbers.get(j + 1)){
                    int a = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, a);
                }
            }
        }

        for (int i = strings.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(strings.get(j), strings.get(j + 1))) {
                    String s = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, s);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < indexOfNumbers.size(); j++) {
                if (i == indexOfNumbers.get(j)) {
                    array[i] = String.valueOf(numbers.get(j));
                }
            }
            for (int j = 0; j < indexOfStrings.size(); j++) {
                if (i == indexOfStrings.get(j)) {
                    array[i] = strings.get(j);
                }
            }

        }
        /*
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " " + indexOfNumbers.get(i));
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(strings.get(i) + " " + indexOfStrings.get(i));
        }
        */
        //напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
