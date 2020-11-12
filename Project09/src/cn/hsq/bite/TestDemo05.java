package cn.hsq.bite;

import java.util.Scanner;

public class TestDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字，我们帮你判断是否是质数:");
        int i = sc.nextInt();
        if(i==2 || i==3 || i==5 || i==7){
            System.out.println(i+"是质数");
        }
        if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
            System.out.println(i+"是质数");
        }else{
            System.out.println(i+"不是质数");
        }
    }
}
