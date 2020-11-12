package com.hsq.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) {
        testMyFile();
    }
    public static void testMyFile(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D://Game");
            System.out.println("step1");
            char c = (char) fileReader.read();
        } catch (FileNotFoundException e) {//作为子类异常在父类异常前边
            System.out.println("step2");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("step3");
            try {
                if(fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
