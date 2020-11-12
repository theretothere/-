package cn.hsq.bite;

import java.util.Scanner;

/**
 * 求两个正整数的最大公约数
 */

public class TestDemo09 {
    public static void main(String[] args) {
        System.out.println("请输入两个数字：");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();
        int check = 0;
        int gys = 0;
        if(num1 > num2){
            check = num2;
        }else{
            check = num1;
        }

        for(int i =1 ; i <= check ; i++ ){
            if(num1 % i == 0 && num2 % i == 0) {
                gys = i;
            }
        }
        System.out.println("最大公约数是："+gys);
    }
}

