package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);

        int min = Byte.MAX_VALUE;

        while (fis.available() > 0) {
            int i = fis.read();
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
        fis.close();
    }
}
