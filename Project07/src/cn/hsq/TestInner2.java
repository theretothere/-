package cn.hsq;

public class TestInner2 {
    public static void test(AA a){
        a.aa();
    }

    public static void main(String[] args) {
        TestInner2.test(new AA() {//匿名内部类
            @Override
            public void aa() {
                System.out.println("kkjbhbkhbj");
            }
        });
    }
}
interface AA{
    void aa();
}
