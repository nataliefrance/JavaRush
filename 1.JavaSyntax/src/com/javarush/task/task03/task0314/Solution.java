package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        int c = 1;
        while (a < 11) {
            while (c < 11) {
                int b = a * c;
                System.out.print(b + " ");
                c++;
            }
            System.out.println("");
            c = 1;
            a++;

            //напишите тут ваш код
        }
    }
}
