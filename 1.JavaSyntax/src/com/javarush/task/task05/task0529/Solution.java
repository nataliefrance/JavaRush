package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String a = "сумма";
        for (int i = 0; ; i++) {
            String s = reader.readLine();
            if (s.equals(a)) {
                break;
            }
            int m = Integer.parseInt(s);
            sum = sum + m;


            //напишите тут ваш код
        }
        System.out.println(sum);
    }
}