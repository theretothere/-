package cn.hsq;
/**
 * 这是用来测试多行注释的用法（包含：多行注释、单行注释、文档注释）
 */

public class hell {
    //main是函数的入口
    int a ;// 从属于对象 成员变量
    static int size;//从属于类 静态变量
    public static void main(String[] args/*args是参数名，可以进行更改*/){
        System.out.println("测试注释!");//这是打印语句
        int a = 123;
        int $a = 123;
        //int 123a = 123;不能用除了$、字母、_以外的符号作为标识符
        {
            int age ;
            age =19;
            //从属于方法 局部变量
        }
    }
}
