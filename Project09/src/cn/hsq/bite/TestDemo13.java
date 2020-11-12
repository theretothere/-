package cn.hsq.bite;

import java.util.Scanner;

public class TestDemo13 {
    public static void main(String[] args) {
        System.out.println("请输入打印几阶乘法表：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            for(int j =1 ; j <= i; j++){
                System.out.print(i+"*"+ j +"=" +i*j+" ");
            }
            System.out.println();
        }
    }
}
