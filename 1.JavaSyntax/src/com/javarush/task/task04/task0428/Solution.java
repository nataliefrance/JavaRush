package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int num = 0;
        if (a>0)
            num++;
        if (b>0)
            num++;
        if (c>0)
            num++;
        System.out.println(num);


        //напишите тут ваш код

    }
}
