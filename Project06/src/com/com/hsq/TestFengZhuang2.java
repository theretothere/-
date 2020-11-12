package com.com.hsq;

/**
 * 在写的时候    属性一定要用私有来修饰
 *
 */

public class TestFengZhuang2 {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(){
        if(age>1&&age<130){
            this.age = age;
        }else{
            System.out.println("请输入正确的年龄！");
        }
    }
}
