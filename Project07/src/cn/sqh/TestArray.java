package cn.sqh;

import java.lang.constant.Constable;
import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i =0;i<a.length-1;i++){
            a[i] = 9+i*2;
        }
        System.out.println(a);
        System.out.println(Arrays.toString(a));

        //Arrays中有一个方法 sort用来 排序
    }
}
class Man implements Comparable{
    int age;
    int id;
    String name;

    public Man(int age,String name){
        super();
        this.age =age;
        this.name = name;

    }
    public String toString(){
        return this.name;

    }
    public int compareTo(Object o){
        Man man = (Man) o;
        if(this.age< man.age){
            return -1;
        }
        if(this.age>man.age){
            return 1;

        }
        return 0;
    }
}