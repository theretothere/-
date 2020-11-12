package cn.hsq.bite;

import java.util.Scanner;

/**
 *
 */

public class TestDemo11 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 3 ; i++ ){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你的密码:");
            String str1 = "Hello";
            String str = sc.nextLine();
            if(str.equals(str1)){
                System.out.println("欢迎您的登录");
            }else{
                System.out.println("输入错误，请再次尝试");
            }
        }
    }
}
