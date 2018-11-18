package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = (numbers.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (numbers[j] > numbers[j+1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }


        //напишите тут ваш код
    }
}
