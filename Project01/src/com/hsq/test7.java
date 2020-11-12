package com.hsq;

public class test7 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,4,5,0,6,0,7};
        //2.
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                count++;
            }
        }
        //3.
        int index = 0;
        int[] newArray = new int[count];
        for(int i =0;i<a.length;i++){
            if(a[i]!=0){
                newArray[index] = a[i];
                index++;
            }
        }
        a =null;
        for(int v:newArray){
            System.out.println(v);
        }
    }
}
