package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String fileName = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
       while (true){
           String s = reader.readLine();
           list.add(s);
           if(s.equals("exit")){
               break;
           }

       }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
       for(int i = 0; i <list.size(); i++) {
           writer.write(list.get(i));
           writer.newLine();
       }
       writer.close();
        // напишите тут ваш код
    }
}
