import java.io.File;

/**
 * 列出下一级
 * 递归：方法自己调用自己
 * 递归头：何时结束递归调用
 * 递归体：重复调用
 */
public class DirDemo03
{
    public static void main(String[] args)
    {
      printTen(1);
    }
    public static void printTen(int n){
        if(n>10){//递归头：结束递归
            return;
        }
        System.out.println(n);//递归体：方法自己调用自己
        printTen(n+1);
    }
}
