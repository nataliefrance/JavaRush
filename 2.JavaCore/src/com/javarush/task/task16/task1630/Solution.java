package com.javarush.task.task16.task1630;

import java.io.*;

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

        @Override
        public void run() {
            try {
                String s = getFileContent();
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
            FileInputStream is = new FileInputStream(fileName);
            String s = "";
            while (is.available() > 0){
                s = s + ((char) is.read());
            }
            is.close();
            return s;
        }
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent() throws IOException;
        void join() throws InterruptedException;
        void start();
    }

    //add your code here - добавьте код тут
}
