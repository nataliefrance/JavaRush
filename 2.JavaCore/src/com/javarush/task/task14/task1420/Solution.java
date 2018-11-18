package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        List<Integer> numsOfA = new ArrayList<>();
        List<Integer> numsOfB = new ArrayList<>();
        List<Integer> total = new ArrayList<>();
//        try {
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0){
            throw new Exception();
        }
        for (int i = 0; i < list.size(); i++) {
            if (a % list.get(i) == 0) {
                numsOfA.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (b % list.get(i) == 0) {
                numsOfB.add(list.get(i));
            }
        }
        for (int i = 0; i < numsOfA.size(); i++) {
            for (int j = 0; j < numsOfB.size(); j++) {
                if (numsOfA.get(i) == numsOfB.get(j)) {
                    total.add(numsOfA.get(i));
                }
            }
        }

//        int nod = 1;
//        for (int i = 0; i < total.size(); i++) {
//            nod = nod * total.get(i);
//        }
//        System.out.println(nod);

           int max = 0;
           for (int i = 0; i <total.size(); i++) {
               if (total.get(i) > max) {
                   max = total.get(i);
                }
           }
           System.out.println(max);

//            for (int i = total.size(); i > 0; i--) {
//                for (int j = 0; j < total.size()-1; j++) {
//                    int x = total.get(j);
//                    total.add(j, total.get(j+1));
//                    total.add(j+1, x);
//                }
//            }
//            } catch(Exception e){
//                System.out.println(e.getClass());
//            }

    }

}

