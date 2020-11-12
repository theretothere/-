package cn.hsq;

import java.util.Scanner;

public class TestFor01 {
    public static void main(String[] args) {
        System.out.println("请输入你要输入的行数和列数：");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int i = sc1.nextInt();
        int j = sc2.nextInt();
        for(int x=0;x<i;x++){
            for(int y =0;y<j;y++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
