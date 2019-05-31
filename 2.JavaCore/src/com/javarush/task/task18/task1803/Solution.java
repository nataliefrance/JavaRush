package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);

        int[] arrayOfAllBytes = new int[255];

        while (fis.available() > 0) {
            int someByte = fis.read();
            arrayOfAllBytes[someByte]++;
        }
        
        int max = 0;

        for (int howOften : arrayOfAllBytes) {
            if (howOften > max) {
                max = howOften;
            }
        }

        for (int i = 0; i < arrayOfAllBytes.length; i++) {
            if (arrayOfAllBytes[i] == max) {
                System.out.print(i + " ");
            }
        }

        fis.close();
        reader.close();
    }
}
