package cn.hsq.bite;

/**
 * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
 */

public class TestDemo08 {
    public static void main(String[] args) {
        for(int i = 1; i<=100 ; i++){
            double sum = 0.0;
            double sum1 = 0.0;
            double sum2 = 0.0;
            if(i%2 == 0){
                sum1 -= 1.0/i;
            }
            if(i%2 == 1){
                sum2 += 1.0/i;
            }
            sum = sum1 +sum2 ;
            System.out.println(sum);
        }
    }
}
