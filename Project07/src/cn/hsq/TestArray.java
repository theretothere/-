package cn.hsq;

public class TestArray {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {2,3,4,5};
        //默认初始化
        int[] b = new int[4];//默认给数组的元素进行复制，
        // 赋值的规则和成员变量默认赋值规则一致
        //动态初始化
        int[] c = new int[10];
        c[0] = 1;
        c[1] = 2;
    }
}
