package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new T1());
        threads.add(new T2());
        threads.add(new T3());
        threads.add(new T4());
        threads.add(new T5());
    }

    public static void main(String[] args) {
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            if (this.isInterrupted()) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class T3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class T4 extends Thread implements Message {

        @Override
        public void run() {
            while(!isInterrupted()){

            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class T5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            while (true) {
                try {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(i);
                        break;
                    } else i = i + Integer.parseInt(s);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}