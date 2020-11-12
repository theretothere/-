package cn.hsq.bite;

public class Fac
{
    public static void main(String[] args)
    {
        int result = 1;
        int sum = 0;
        for(int i = 1; i<=5 ; i++){
                result = i*result;
                sum += result;
        }
        System.out.println(sum);
    }
}
