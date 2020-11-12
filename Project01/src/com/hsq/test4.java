package com.hsq;

public class test4 {
    public static void main(String[] args) {
        int[] a ={3,5,7,2,1,7,8,5,9};
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("数组中的最大值为："+max);
        System.out.println("数组中的最小值为："+min);
    }
}
