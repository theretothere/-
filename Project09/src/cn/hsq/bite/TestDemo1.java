package cn.hsq.bite;

public class TestDemo1 {
    public static void main(String[] args) {
        int num = 0;
        for(int i =1 ; i <= 100 ; i++ ){
            if(i%10 == 9|| i/10 == 9){
                num++;
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}
