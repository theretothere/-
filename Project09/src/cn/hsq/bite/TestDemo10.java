package cn.hsq.bite;

import java.util.Scanner;

/**
 * 求一个整数，在内存当中存储时，二进制1的个数。
 */

public class TestDemo10 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
            while(num/2==0){
                count++;
            }
        System.out.println(count);
    }
}
