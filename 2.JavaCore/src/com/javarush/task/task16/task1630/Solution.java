package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();

        System.out.println(f.getFileContent());
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        ArrayList<String> list = new ArrayList<>();

        @Override
        public void run() {
            try {
                File file = new File(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String s;
                while ((s = reader.readLine()) != null){
                    list.add(s);
                }
                getFileContent();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() throws IOException {
            String result = "";
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i) + " ";
            }
            return result;
        }
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent() throws IOException;
        void join() throws InterruptedException;
        void start();
    }
}
