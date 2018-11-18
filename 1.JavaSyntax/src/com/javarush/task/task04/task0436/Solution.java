package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);
        for (int i = 1; i<=m; i++) {
            for (int i2 = 1; i2 <= n; i2++) {
                System.out.print("8");
            }
            System.out.println();
            //напишите тут ваш код

        }
    }
}
