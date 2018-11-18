package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Solution.*;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    //<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
