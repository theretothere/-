package com.com.hsq;

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
    }
}
class Vechicle{
    public void run(){
        System.out.println("Running.....");
    }
    public void stop(){
        System.out.println("Stop!!");
    }
    public Person WhoIsPsg(){
        return new Person();
    }
}
class Horse extends Vechicle{
   /* public void run(){
        System.out.println("四蹄翻飞，嘚嘚嘚.....");
    }*/
   /*public Object WhoIsPsg(){//
       return new Student();
   }*/
   /*public Person WhoIsPsg(){//
       return new Person();
   }*/
    public Student WhoIsPsg(){//返回值类型小于等于父类的类型
        return new Student();//方法名、形参列表相同
    }//访问权限、子类大于等于父类
}
