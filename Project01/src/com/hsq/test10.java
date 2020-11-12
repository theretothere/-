package com.hsq;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        String[] userBox = {"胡苏秦","Learning","Java"};
        int[] passwordBox = {123,456,789};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账户名");
        String user = input.nextLine();
        System.out.println("请输入密码");
        boolean b = false;
        int password = input.nextInt();
        for(int i=0;i<userBox.length;i++){
            if(userBox[i].equals(user)){
                if(passwordBox[i]==password){
                    System.out.println("登录成功");
                }else{
                    System.out.println("密码错误");
                }
                b = true;
                break;
            }
        }
        if(!b) {
            System.out.println("用户名不存在");
        }
    }
}
