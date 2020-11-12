package cn.hsq.bite;

public class Three
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 100 ; i++ ){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                System.out.println("能够被三整除且能够被5整除");
            }
            continue;
        }
    }
}
