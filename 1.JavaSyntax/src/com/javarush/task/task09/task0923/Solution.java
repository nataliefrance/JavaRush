package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> noVowels = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowels.add(chars[i]);
            } else  if (isVowel(chars[i]) == false && chars[i] != ' ') {
                noVowels.add(chars[i]);
            }

        }
        for (int i = 0; i < vowels.size(); i++) {
            System.out.print(vowels.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < noVowels.size(); i++) {
            System.out.print(noVowels.get(i) + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}