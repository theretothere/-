package cn.hsq.test;

/**
 * 测试StringBuilder、StringBuffer
 *
 * StringBuilder  StringBuffer  是一个可变的字符序列
 *
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        String str;
        //StringBuilder线程效率高，安全性低;
        // StringBuffer线程安全性高，效率低。
        StringBuilder sb = new StringBuilder("sdfasdfsadfasdfasd");
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
        sb.setCharAt(3,'F');
        System.out.println(Integer.toHexString(sb.hashCode()));
        //地址没有发生改变，但是相应的值发生了改变
        System.out.println(sb);
    }
}
