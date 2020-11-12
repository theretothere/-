package com.hsq;

public class test6 {
    public static void main(String[] args) {
        int[] oldArray = {1,2,3,9,4,5};
        int max = oldArray[0];
        int index = 0;
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i]>max){
                max = oldArray[i];
                index = i;
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最大值位置"+index);
        int[] newa = new int[index];
        int[] newb = new int[oldArray.length-index-1];
        for(int i =0;i<newa.length;i++){
            newa[i] = oldArray[i];
        }
        for(int i=0;i<newb.length;i++){
            newb[i] = oldArray[(index+1)+i];
        }
        for(int v:newa){
            System.out.println(v);
        }
        System.out.println("---------------------");
        for(int v:newb){
            System.out.println(v);
        }
    }
}
