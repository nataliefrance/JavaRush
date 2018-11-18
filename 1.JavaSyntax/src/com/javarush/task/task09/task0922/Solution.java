package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = f1.parse(s);

        SimpleDateFormat f2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(f2.format(date).toUpperCase());
        //напишите тут ваш код
    }
}
