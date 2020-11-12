package com.com.hsq;

import com.sun.tools.javac.Main;

/**
 * 程序追求“高内聚，低耦合”
 *
 * 高内聚 就是 类的内部数据操作细节自己完成，不允许外部干涉
 *
 * 低耦合 就是 仅暴露少量的方法给外部使用，尽量方便外部调用
 *
 * private default protected public
 * 本类中  同一个包中   子类  所有类
 */
public class TestFengZhuang {
    public static void main(String[] args) {
        Human h = new Human();
        //h.age = 13;
        h.name = "张三";
    }
}
class Human{
    private int age;
    String name;//只能被本包内的类访问
    void syaAge(){
        System.out.println(age);
    }
}

class Boy extends Human{
    void sayHello(){//拥有了父类的age这个属性，但是无法使用父类中私有的属性和方法
        System.out.println(name);
    }
}
