package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Iterator;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Ivanov1", df.parse("JULY 30 1989"));
        map.put("Ivanov2", df.parse("AUGUST 28 1990"));
        map.put("Ivanov3", df.parse("NOVEMBER 6 1989"));
        map.put("Ivanov4", df.parse("DECEMBER 13 1988"));
        map.put("Ivanov5", df.parse("JANUARY 1 2000"));
        map.put("Ivanov6", df.parse("APRIL 7 1964"));
        map.put("Ivanov7", df.parse("SEPTEMBER 8 1970"));
        map.put("Ivanov8", df.parse("OCTOBER 15 1987"));
        map.put("Ivanov9", df.parse("JUNE 6 2004"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8) {
                iterator.remove();
            }


        }
    }
        public static void main (String[]args){

        }
    }
