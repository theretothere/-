package com.com.hsq;

public class TestObject {
    public static void main(String[] args) {
        TestObject to = new TestObject();
        System.out.println(to);
        System.out.println(to.toString());
        Person2 p2 = new Person2("赵四",14);
        System.out.println(p2.toString());
    }
    public String toString(){
        return "测试Object对象";
    }
}
class Person2{
    int age;
    String name;
    @Override
    public String toString(){
        return name+"今年"+age;
    }
    Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
