package com.hsq;

public class test8xiu {
    public static void main(String[] args) {
        int[] primeNumberArray = new int[50];
        int index = 0;
        for(int num = 2;num<=100;num++){
            boolean b= false;
            for(int i =2;i<=num/2;i++){
                if(num%i==0){
                    b =true;
                    break;
                }
            }
            if(!b){
                primeNumberArray[index++] = num;
            }
        }
        int[] newArray = new int[index];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = primeNumberArray[i];
        }
        primeNumberArray = null;
        for(int v: newArray){
            System.out.println(v);
        }
    }
}
