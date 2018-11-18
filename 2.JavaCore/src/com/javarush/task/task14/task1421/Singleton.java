package com.javarush.task.task14.task1421;

public abstract class Singleton {
    private static Singleton instance;
    public static Singleton getInstance(){
        return instance;
    }
    private Singleton(){

    }
}
