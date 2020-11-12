package com.hsq;

import java.util.Scanner;

public class GroupChange {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个周数");
        int week = input.nextInt();
        for(int i = 1; i<=week%4 ;i++){
            int[] x = arr[0];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = arr[3];
            arr[3] = x;
        }
        for(int [] array:arr){
            for(int v:array){
                System.out.println(v+"\t");
            }
            System.out.println();
        }
    }
}
