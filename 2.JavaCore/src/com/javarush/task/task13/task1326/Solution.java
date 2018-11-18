package com.javarush.task.task13.task1326;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        ArrayList<Integer> list = new ArrayList<>();
        String text = null;
        while((text = fileReader.readLine()) != null){
            if (text.isEmpty() == false) {
               list.add(Integer.parseInt(text));
            }
        }


        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i <list.size(); i++){
            if(list.get(i) %2 == 0){
                even.add(list.get(i));
            }
        }

        for (int i = even.size(); i > 0; i--) {
            for (int j = 0; j < even.size()-1; j++) {
                if (even.get(j) > even.get(j + 1)) {
                    int x = even.get(j + 1);
                    even.remove(j + 1);
                    even.add(j + 1, even.get(j));
                    even.remove(j);
                    even.add(j, x);
                }
            }
        }
        for (int a : even) {
            System.out.println(a);
        }

        fileReader.close();

    }

    // напишите тут ваш код
}

