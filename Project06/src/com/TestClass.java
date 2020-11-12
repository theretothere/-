package com;

public class TestClass {
    String name;
    String id;
    int age;
    char sex = '男';
    Computer computer;
    void study(){
        System.out.println("学习java1000集"+computer.brand);
    }
    void play(){
        System.out.println("玩会游戏，农药赛高！！！");
    }
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.play();
        tc.name = "Jom";
        tc.age = 19;
        tc.sex = '男';
        tc.id = "12313";

        Computer c = new Computer();
        c.brand = "Lenove";
        tc.computer = c;
        tc.study();
    }

}
class Computer{
    String brand;
}
