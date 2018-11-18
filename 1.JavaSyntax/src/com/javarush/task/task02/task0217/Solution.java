package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int e = min(a, b); //напишите тут ваш код
        int f = min(c, d);
        int g = min(e, f);
        return g;
    }

    public static int min(int a, int b) {
       int c;
        if (a < b)
           c = a;
        else c = b;//напишите тут ваш код
       return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}