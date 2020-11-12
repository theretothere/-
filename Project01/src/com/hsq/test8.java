package com.hsq;

public class test8 {
    public static void main(String[] args) {
        //1.
        int count = 0;
        int index = 0;
        for(int num=2;num<=1000;num++) {
            boolean b = false;
            for (int i = 2; i <= num/2; i++) {//从2-8之间还有没有其余的数字可以整除的
                if (num % i == 0) {
//                    System.out.println(num + "不是素数");
                    b = true;
                    break;
                }
            }
            if (!b) {
//                System.out.println(num + "是素数");
                count++;
            }
        }
        System.out.println("经过找寻2~100之间的素数的个数为："+count);
        int[] primeNumberArray = new int[count];
        for(int num=2;num<=1000;num++) {
            boolean b = false;
            for (int i = 2; i <= num/2; i++) {//从2-8之间还有没有其余的数字可以整除的
                if (num % i == 0) {
//                    System.out.println(num + "不是素数");
                    b = true;
                    break;
                }
            }
            if (!b) {
//                System.out.println(num + "是素数");
                primeNumberArray[index++] = num;
            }
        }
        for(int v:primeNumberArray){
            System.out.println(v);
        }
    }
}
