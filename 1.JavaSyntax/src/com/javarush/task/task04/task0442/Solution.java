package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int i = 0;
        for (; i != -1; ) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            sum = sum + a;
            i = a;
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}
