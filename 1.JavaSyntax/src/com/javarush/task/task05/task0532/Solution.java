package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int N = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= N; i++) {
            //напишите тут ваш код
            int a = Integer.parseInt(reader.readLine());
            if (i==1) {
                maximum = a;
            }
            else maximum = (maximum <= a) ? a : maximum;
        }
        System.out.println(maximum);
    }
}
