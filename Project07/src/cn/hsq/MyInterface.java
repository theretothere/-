package cn.hsq;

/**
 * 接口 是比 抽象类 还要 抽象 的 抽象类
 *
 * 接口里边没有一个 方法的实现
 *
 *
 * 更加全面专业的实现了，  规范和具体的分离
 */

public interface MyInterface {
    int MAX_AGE = 1000;
    void test01();
}

class Myclass implements MyInterface{
    public void test01(){
        System.out.println(MAX_AGE);
        System.out.println("MyInterface");
    }
}
