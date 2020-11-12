package cn.hsq;

import java.math.BigDecimal;

public class TestPrimitiveDateType2 {
    public static void main(String[] args) {
        //浮点数是不精确的，一定不要用比较！
        float f = 3.14f;
        double d = 6.28;
        System.out.println(f==d);//结果为false

        float f1 = 23423424234f;
        float f2 = f1 + 1 ;
        if(f1==f2){
            System.out.println("f1==f2");
        }else{
            System.out.println("f1!=f2");
        }


        System.out.println("#######################");
        //使用精确浮点运行，推荐使用 BigDecimal
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001
    }
}
