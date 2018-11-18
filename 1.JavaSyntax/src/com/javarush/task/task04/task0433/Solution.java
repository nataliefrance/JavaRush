package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 1;
        while (n <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            //напишите тут ваш код
            if(n<10)
            System.out.println();
            n++;
        }
    }
}