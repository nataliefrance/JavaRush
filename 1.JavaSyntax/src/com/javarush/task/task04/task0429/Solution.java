package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        int pl = 0;
        int otr = 0;

        if (a != 0) {
            if (a > 0)
                pl++;
            else otr++;
        }
        if (b != 0) {
            if (b > 0)
                pl++;
            else otr++;
        }
        if (c != 0) {
            if (c > 0)
                pl++;
            else otr++;
        }
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pl);


        //напишите тут ваш код

    }
}
