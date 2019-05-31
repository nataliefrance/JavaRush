package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        boolean findMostRare = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);

        int[] arrayOfMostRareBytes = new int[255];

        while(fis.available() > 0){
            arrayOfMostRareBytes[fis.read()]++;
        }

        int min = 1;

        if (!findMostRare){
            for (int i = 0; i < arrayOfMostRareBytes.length; i++) {
                if (arrayOfMostRareBytes[i] == min){
                    System.out.print(i + " ");
                    findMostRare = true;
                }
            }
            min++;
        }

        fis.close();
        reader.close();
    }
}
