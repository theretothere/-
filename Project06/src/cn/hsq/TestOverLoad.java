package cn.hsq;

public class TestOverLoad {
    public static void main(String[] args) {
        add(10,24);
        add(1.1,34);
    }

    public static void add(int a,int b){
        int sum =a+b;
        System.out.println(sum);
    }
    public static void add(double a,double b){
        double sum =a+b;
        System.out.println(sum);
    }
}
