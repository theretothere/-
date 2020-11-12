package cn.hsq;

/**
 * 静态内部类和非静态内部类
 */
public class TestInner {
    public static void main(String[] args) {
            Outer o = new Outer();//创建外部类对象
            //创建内部类对象
        //普通非静态内部类
        //所以需要先创建外部类对象
        Outer.Inner o1 = new Outer().new Inner();
        o1.show();
    }
}
class Outer{
    private int age = 10;

    public void testOuter(){
        System.out.println();
    }

    class Inner{//定义在外部类里边。可以直接访问外部类的成员
        //非静态内部类 不能有静态方法
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("展示外部类的对象："+Outer.this.age);
            System.out.println("展示内部类的对象："+this.age);
            System.out.println("局部变量："+age);
        }
    }
}
