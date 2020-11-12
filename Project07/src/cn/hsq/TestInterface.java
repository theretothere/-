package cn.hsq;

public class TestInterface {
    public static void main(String[] args) {
        Fly f = new Angel();
        f.fly();
    }
}

/**
 * 飞行接口
 */
interface Fly{
    int HEIGHT = 1300;
    void fly();

}
//天使接口
interface Honest{
    void helpOther();
}
class Angel implements Fly,Honest{
    @Override
    public void fly() {
        System.out.println("飞机飞上高空");
    }

    @Override
    public void helpOther() {
        System.out.println("喜欢帮助别人");
    }
    //实现类可以实现多个父接口

}
class GoodMan implements Honest{
    public void helpOther(){
        System.out.println("GoodMan.helpOther()");
    }
}
class BirdMan implements Fly{
    public void fly(){
        System.out.println("BirdMan.fly()");
    }
}