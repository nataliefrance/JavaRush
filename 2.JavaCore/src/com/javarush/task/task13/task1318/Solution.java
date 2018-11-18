package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inStream = new FileInputStream(s);
        while (inStream.available() > 0){
            System.out.print((char) inStream.read());
        }
        inStream.close();
        reader.close();
        // напишите тут ваш код
    }
}