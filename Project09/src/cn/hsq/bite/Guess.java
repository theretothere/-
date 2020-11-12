package cn.hsq.bite;
import java.util.Random;
import java.util.Scanner;
/**
 * 完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，
 * 等于的时候退出程序。
 */
public class Guess {
    public static void main(String[] args) {
        Random ran = new Random();
        int num1 = ran.nextInt(100)+1;//左闭右开区间
        System.out.println("请输入你猜测的数字：（范围在1~100之间）");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == num1){
            System.out.println("恭喜你猜对了");
        }else{
            System.out.println("猜错了");
        }
    }
}
