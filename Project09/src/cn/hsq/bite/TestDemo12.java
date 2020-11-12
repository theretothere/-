package cn.hsq.bite;

import java.util.Scanner;

public class TestDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int i = sc.nextInt();
        int bai = i/100;
        int shi = i/10-bai*10;
        int ge = i%10;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
