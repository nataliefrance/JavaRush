package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour)//напишите тут ваш код
    {
        int sec = hour * 60 * 60;
        return sec;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(6));
        System.out.println(convertToSeconds(3));
        //напишите тут ваш код
    }
}
