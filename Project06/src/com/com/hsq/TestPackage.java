package com.com.hsq;

public class TestPackage {
    public static void main(String[] args) {
        Student stu = new Student("张三",172,"计算机专业");
        stu.rest();
        Student stu1 = new Student();
        System.out.println(stu1 instanceof Student);
        System.out.println(stu.toString());
    }
}
class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息！");
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("学习计算机专业");
    }
    public Student(String name,int height,String major){
        this.name =name;
        this.height = height;
        this.major = major;
    }
    Student(){

    }
}
