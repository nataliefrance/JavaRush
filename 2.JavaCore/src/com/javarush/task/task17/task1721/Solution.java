package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 2; i++) {
                String fileName = reader.readLine();
                File file = new File(fileName);
                FileInputStream fIS = new FileInputStream(file);
                InputStreamReader iSR = new InputStreamReader(fIS);
                BufferedReader bufReader = new BufferedReader(iSR);
                String line;
                while ((line = bufReader.readLine()) != null) {
                    if (i == 0) {
                        allLines.add(line);
                    } else forRemoveLines.add(line);
                }
                bufReader.close();
                fIS.close();
                iSR.close();
            }
            reader.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        for (int i = 0; i < allLines.size(); i++) {
            System.out.println(allLines.get(i));
        }
        for (int i = 0; i < forRemoveLines.size(); i++) {
            System.out.println(forRemoveLines.get(i));
        }

        Solution solution = new Solution();

        try{
            solution.joinData();
        } catch (CorruptedDataException ex){
            ex.printStackTrace();
        }

        for (int i = 0; i < allLines.size(); i++) {
            System.out.println(allLines.get(i));
        }
        for (int i = 0; i < forRemoveLines.size(); i++) {
            System.out.println(forRemoveLines.get(i));
        }
    }

    public void joinData() throws CorruptedDataException {

        //Принцип работы метода collectionA.containsAll(collectionB) состоит в следующем:
        //Для каждого элемента коллекции B происходит проверка на его принадлежность коллекции А.
        //Проверка эта заключается в следующем:
        //Берется один элемент B и в цикле сравнивается с каждым элементом коллекции А.
        //Причем сравнение идет с помощью метода equals

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
