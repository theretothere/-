package cn;

public class Test {//这个类没有什么现实意义
    //只是为了将主方法写在这里而已
    public static void main(String[] args){
        //想要在这里使用一个人 来执行操作
        //创建一个人人类的对象  找一个空间来存储
        hsq h = new hsq();//我们自己创造的类型class  基本类型 引用类型？
        //h的小人  也有自己的名字 年龄 性别 有没有值？
        //通过对象. 去调用属性 存值/取值
        h.name = "胡苏秦";
        h.age = 18;
        h.sex = '男';
        hsq h1 = new hsq();
        h1.name = "成哥";
        h1.age = 16;
        h1.sex = '男';
        System.out.println(h.name+"今年"+h.age+"岁,性别是"+h.sex);
        System.out.println(h1.name+"今年"+h1.age+"岁,性别是"+h1.sex);
        h.eat();
        //1.创建一个对象 人类的对象
        hsq  p = new hsq();
        //2.通过 对象. 的方式 去调用方法和属性
        //调用方法 是为了让方法按照描述的过程执行一遍
        p.eat();//属性之后没有跟着小括号 方法后边有小括号是留着以后传参数的
        String myName = p.tellName();
        System.out.println("接收到了tellName方法的返回值"+myName);
        p.chiFan(1,"馒头");
        String drinkName = p.buyDrink(10);
        System.out.println("买了一瓶"+drinkName);
        p.drawStar(5,true);
    }
}
