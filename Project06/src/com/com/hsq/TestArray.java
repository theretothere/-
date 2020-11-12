package com.com.hsq;

/**
 * 数组的三个基本特点：
 *
 * 一、数组的长度是确定的。 数组一旦被创建，它的大小就是不可以改变的
 * 二、它的元素必须是相同类型，不允许出现混合类型
 * 三、数组类型可以是任何数据类型，包括基本类型和引用类型
 *
 * 数组变量属于引用类型，数组就是对象，数组中的每个元素相当于这个对象的成员变量
 */

public class TestArray {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        String[] arr02 = new String [5];
        User2[] arr03 = new User2[3];
        arr01[0] = 13;
        arr01[1] = 15;
        arr01[2] = 20;

        //通过循环初始化数组
        for(int i=0;i<arr01.length;i++){
            arr01[i] = 10*i;
        }
        //通过循环输出数组内元素的值
        for(int i=0;i<arr01.length;i++){
            System.out.println(arr01[i]);
        }

        arr03[0] = new User2(123,"赵四");
        System.out.println(arr03[0].getName());
    }
}
class User2{
    private int id;
    private String name;
    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}