package com.com.hsq;

/**
 * super 是直接父类对象的引用，可以通过super来访问父类中被子类覆盖的方法或者属性
 *
 *
 * 语句块 在类进行初始化的时候执行   （语句块没有名字无法被调用）
 *
 *
 */
public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;

    public void f(){
        value = 100;
        System.out.println("FatherClass.value="+value);
    }
}

class ChildClass extends FatherClass{

    public int value;
    public void f(){
        super.f();//调用父类对象的普通方法
        value = 200;
        System.out.println("ChildClass.value="+value);
        System.out.println(value);
        System.out.println(super.value);
    }
}
