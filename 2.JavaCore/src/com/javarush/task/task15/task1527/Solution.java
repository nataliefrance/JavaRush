package com.javarush.task.task15.task1527;

import java.io.*;
import java.io.InputStreamReader;


/* 
Парсер реквестов
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String adress = reader.readLine();
        String parameters = adress.substring(adress.indexOf("?") + 1, adress.length());
        String[] list = parameters.split("&");


        for (String s : list) {
            String[] tokens = s.split("=");
            if (s.equals(list[list.length - 1])) {
                System.out.println(tokens[0]);
            } else
                System.out.print(tokens[0] + " ");
        }

        for (String s : list) {
            String[] tokens = s.split("=");
            if (tokens[0].equals("obj")) {
                try {
                    alert(Double.parseDouble(tokens[1]));
                } catch (Exception ex){
                    alert(tokens[1]);
                }
            }
        }


//        if (adress.contains("obj")) {
//            if (value.contains(".")) {
//                alert(Double.parseDouble(value));
//            } else alert(value);
//        }
//    }
    }

        public static void alert (double value){
            System.out.println("double: " + value);
        }

        public static void alert (String value){
            System.out.println("String: " + value);
        }
    }

