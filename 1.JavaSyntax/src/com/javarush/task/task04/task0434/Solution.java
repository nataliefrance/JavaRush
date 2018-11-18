package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1;
        while (a <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print(a * i + " ");
                i++;
            }
            if (a < 10)
                System.out.println();
            a++;
            //напишите тут ваш код

        }
    }
}