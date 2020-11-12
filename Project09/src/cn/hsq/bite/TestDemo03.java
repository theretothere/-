package cn.hsq.bite;

public class TestDemo03 {
    public static void main(String[] args) {
        for(int i = 1000; i<=2000 ; i++ ){
            if(i%400 == 0 || (i%4==0 && i/100 != 0)){
                System.out.println(i+"是闰年");
            }
        }
    }
}
