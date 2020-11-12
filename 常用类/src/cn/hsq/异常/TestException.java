package cn.hsq.异常;

public class TestException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        if(b != 0) {
            System.out.println(a / b);
        }
        String str = null;
        if(str!=null) {
            System.out.println(str.length());
        }
    }
}
