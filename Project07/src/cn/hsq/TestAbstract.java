package cn.hsq;

//抽象类的意义在于：为子类提供统一的，规范的模板，子类必须实现相关的抽象方法！

/**
 * 有抽象方法的类 只能定义成为抽象类
 *
 * 抽象类不能实例化
 *
 * 抽象类可以包括属性方法，构造方法。但是构造方法不能用new来实现，只能用来被子类调用
 *
 * 抽象类只能用来被继承
 *
 * 抽象方法必须被子类实现
 */

//抽象类
public abstract class TestAbstract {
    abstract public void Animals();//抽象方法
    //第一、没有实现
    //第二、子类必须实现
    public void run(){
        System.out.println("跑啊跑");
    }
}
class Dog extends TestAbstract{
    public void Animals(){
        System.out.println("嗷呜汪!!!");
    }

    public static void main(String[] args) {
        TestAbstract ta =  new TestAbstract() {
            @Override
            public void Animals() {
                System.out.println();
            }
        };
    }
}