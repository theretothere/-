package com.hsq.test;

import java.io.File;
import java.io.IOException;

/**
 * File类是I/O操作中最常用的类
 *
 * java.io.File类：代表文件和目录
 */
public class TestFile {
    public static void main(String[] args) throws IOException {

        File f= new File("D:\\英雄时刻");

        f.renameTo(new File("D:\\Study"));

        System.out.println(System.getProperty("usr.dir"));
        File f2 = new File("a.txt");
        f2.createNewFile();

        File f3 = new File("d:\\电影\\华语");
        //boolean flag = f3.mkdir();//只要有一个不存在，就不会创建目录树
        boolean flag = f3.mkdirs();//不存在也没关系，会创建一整个目录树
        System.out.println(flag);
    }
}
