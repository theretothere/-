package cn.hsq;

import java.util.Scanner;

public class TestScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.nextLine();
        System.out.println("请输入你的爱好：");
        String favorat =  sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("###############################");
        System.out.println(name);
        System.out.println(favorat);
        System.out.println(age);
    }
}
