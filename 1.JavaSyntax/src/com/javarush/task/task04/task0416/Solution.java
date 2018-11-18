package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);
        if (t % 10 <= 40 || t % 10 == 0){
            System.out.println("красный");}
        else if (t % 10 == 4 || t % 10 == 9) {
                System.out.println("жёлтый");}
        else System.out.println("зелёный");


        //напишите тут ваш код
    }
}