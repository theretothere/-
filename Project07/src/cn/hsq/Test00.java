package cn.hsq;

public class Test00 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i =0;i<a.length;i++){
            a[i] = 9+2*i;
        }
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("#############");
        //foreach循环
        //用于读取数组中元素的值   不能改变元素的值
        //感觉类似于增强for循环
        for(int v: a){
            System.out.println(v);
        }
    }
}
