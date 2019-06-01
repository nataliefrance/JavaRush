package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);

        ArrayList<Integer> listOfBytes = new ArrayList<>();

        while (fis.available() > 0){
            int someByte = fis.read();
            if (!listOfBytes.contains(someByte)){
                listOfBytes.add(someByte);
            }
        }

        Collections.sort(listOfBytes);
        for (int byteInList: listOfBytes) {
            System.out.print(byteInList + " ");
        }

        fis.close();
        reader.close();
    }
}
