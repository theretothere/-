package com;

public class sqh {
    public static void main(String[] args) {
        long a = faction(10);
        //System.out.println(a);
        long b = fationLoop(10);
        System.out.println(b);
    }
    static long fationLoop(int a){
        long result = 1;
        while(a>1){
            result *= a*(a-1);
            a-=2;
        }
        return result;
    }
    static long faction(int n){
        if(n==1){
            return 1;
        }else{
            return n*faction(n-1);//n!=n*(n-1)!
        }
    }
}
