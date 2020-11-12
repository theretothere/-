package com.com.hsq;

/**
 * overload 重载
 * override 重写
 *
 * 多态存在的三个必要条件：
 * ①继承
 * ②方法重写
 * ③父类引用指向子类对象
 */
public class TestDuoTai {
    public static void main(String[] args) {
        Animals a = new Animals();
        animalsCry(a);
        Animals d = new Dog();//自动向上转型
        //d.watchDoor(); 被认为是Animals类的一员，无法调用Dog类的方法
        Dog d2 = (Dog) d;//强制向下转型
        d2.watchDoor();

        Animals c = new Cat();
        Dog d3 = (Dog)c;//java.lang.ClassCastException 类型转换错误
        d3.watchDoor();//不能将猫强制转换成狗 编译时可以通过，但是运行时，会报错
    }
    static void animalsCry(Animals an){
        an.shout();
    }
}

class Animals{
    public void shout(){
        System.out.println("动物在叫");
    }
}
class Dog extends Animals{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void watchDoor(){
        System.out.println("旺财看门中》》》》》");
    }
}
class Cat extends Animals{
    public void shout(){
        System.out.println("喵喵喵");
    }
}
