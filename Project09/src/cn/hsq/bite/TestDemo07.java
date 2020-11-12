package cn.hsq.bite;

/**
 * 求出0～999之间的所有“水仙花数”并输出。
 * (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
 * 如；153＝1＋5＋3?，则153是一个“水仙花数“。）
 */

public class TestDemo07 {
    public static void main(String[] args) {
        for(int i = 1; i<=999 ; i++){
            int bai = i/100;
            int shi = i/10-bai*10;
            int ge = i%10;
            if(i == 1){
                System.out.println("1不是水仙花数，因为1不是三位数");
            }else if(i == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
                System.out.println(i+"这个数字是水仙花数");
            }
        }
    }
}
