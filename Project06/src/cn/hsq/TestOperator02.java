package cn.hsq;

public class TestOperator02 {
    public static void main(String[] args) {
        //Long类型最好使用L，不要使用l，容易和1搞混
        //在运算的时候已经发生了溢出现象 所以在使用第二种方法的时候已经失败了
        int money = 1000000000;
        int year = 20;
        int total ;
        total = year*money;
        System.out.println("total="+total);
        long l1 = money*year;
        long l2 = money*(long)year;
        System.out.println(l1);
        System.out.println(l2);

        //使用大写的L不容易出现错误
        long l = 2;
        long l4 = 23424l;
        long l5 = 2332342L;
    }
}
