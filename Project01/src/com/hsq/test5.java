package com.hsq;

public class test5 {
    public static void main(String[] args) {
        //1.创建两个数组
        int[] a = {1,2,3};
        int[] b = {4,5};
        //2.数组的长度一旦确定，就不会在发生改变
        int[] newArray = new int[a.length+b.length];
        //只有长度 元素默认值0
        //3.
        for(int i=0;i<a.length;i++){
            newArray[i] = a[i];
        }
        for(int i = 0;i<b.length;i++){
            newArray[a.length+i] = b[i];
        }
        //4.验证一下
        for(int v :newArray){
            System.out.println(v);
        }

    }
}
