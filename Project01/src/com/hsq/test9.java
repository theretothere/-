package com.hsq;

public class test9 {
    public static void main(String[] args) {
        int[] array = {5,2,3,1,4};
        for(int i =1;i<5;i++){
            for(int j =4;j>=i;j--){
                if(array[j]>array[j-1]){
                    int x = array[j];
                    array[j] = array[j=1];
                    array[j-1] = x;
                }
            }
        }
    }
}
