package com.hsq;

public class test1{
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] temp = a;
        a = b;
        b = temp;

        /*//数组互换
        for(int i=0;i<a.length;i++){
            int x =a[i];
            a[i] = b[i];
            b[i] = x;

        }*/
        for(int v:a){
            System.out.println(v);
        }
        System.out.println("------");
        for(int v : b){
            System.out.println(v);
        }
    }
}