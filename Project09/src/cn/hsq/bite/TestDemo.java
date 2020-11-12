package cn.hsq.bite;

public class TestDemo
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 20;
        int tmp = 0;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("===============");
        tmp  = i ;
        i = j;
        j = tmp;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
