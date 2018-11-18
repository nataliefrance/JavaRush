package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String s3 = reader.readLine();
        int y = Integer.parseInt(s3);
        String s2 = reader.readLine();
        int m = Integer.parseInt(s2);
        String s1 = reader.readLine();
        int d = Integer.parseInt(s1);


        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

        //напишите тут ваш код
    }
}
