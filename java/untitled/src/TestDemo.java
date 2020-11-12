import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("请输入你要计算的存储1的数量的数字为：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("输入数字"+n+"的1的数量为："+countNumber(n));
    }
    public static int countNumber(int n){
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
