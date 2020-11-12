package cn.hsq.bite;

import java.util.Scanner;

public class TestDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i = 2;
        if(n <= 0){
            System.out.println(n+"不是素数");
            return ;//遇到return，当前的方法结束
        }
        for(; i <= Math.sqrt(n) ; i++){
            if(i % n == 0){
                System.out.println(i+"不是质数");
            }
            if( i > Math.sqrt(n)){
                System.out.println(i+"是质数");
            }
        }
    }
    public static void main1(String[] args) {
        System.out.println("2,3,5,7"+"是质数");
        for(int i = 2 ; i <= 100 ; i++ ){
               if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 ) {
                   System.out.println(i+"是质数");
               }
        }
    }
}

