package com.javarush.task.task14.task1419;

//import com.sun.jdi.ClassNotLoadedException;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
            int [] array = {1,2,3};
            System.out.println(array[4]);
            byte integer = (byte) 10000;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new MissingFormatArgumentException(""));
            exceptions.add(new NullPointerException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new StringIndexOutOfBoundsException());
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new NoSuchFieldException());
        }

        //напишите тут ваш код

    }
}
