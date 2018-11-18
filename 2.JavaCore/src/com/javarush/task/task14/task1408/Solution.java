package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
Методы должны возвращать строку вида:

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Russia")){
                hen = new RussianHen();
            } else if (country.equals("Ukraine")){
                hen = new UkrainianHen();
            } else if (country.equals("Moldova")){
                hen = new MoldovanHen();
            } else if (country.equals("Belarus")){
                hen = new BelarusianHen();
            }
            //напишите тут ваш код
            return hen;
        }
    }





}
