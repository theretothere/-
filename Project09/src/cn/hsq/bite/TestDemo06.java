package cn.hsq.bite;
import java.util.Scanner;
/**
 * 根据输入的年龄, 来打印出当前年龄的人是少年(低于18),
 * 青年(19-28), 中年(29-55), 老年(56以上)
 */
public class TestDemo06 {
    public static void main(String[] args) {
        System.out.println("请输入一个人的年龄，我们帮助你判断是少年还是青年或是中老年：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("这个人是少年");
        }else if(age>=19 && age<=28) {
            System.out.println("这个人是青年");
        }else if(age >= 29 && age <= 55) {
            System.out.println("这个人是中年");
        }else{
            System.out.println("这个人是老年");
        }
    }
}
