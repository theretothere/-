package cn;

public class com {
    public static void main(String[] args) {
        //通过对象调用普通方法
        com c = new com();
        c.hello();
    }

    public void hello(){
        System.out.println("hello . world!");
    }
}
