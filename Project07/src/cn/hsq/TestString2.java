package cn.hsq;

public class TestString2 {
    public static void main(String[] args) {
        String s1 = new String();//行数为235 public String(){}
        s1 =  "core java";
        String s2 = "Core java";//行数为134
        // public final class String
        // implements
        // java.io.Serializable, Comparable<String>, CharSequence,Constable, ConstantDesc
        //{}
        System.out.println(s1.charAt(3));//提取下标为3的字符
        System.out.println(s2.length());

        System.out.println(s1.equals(s2));//比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写

        System.out.println(s1.indexOf("java"));//字符串s1中是否包含java
        System.out.println(s1.indexOf("apple"));//字符串s1中是否包含apple

        String s = s1.replace(' ','&');
        //将s1中的 空格 替换成 &
        System.out.println("result is :" + s);


        String s3 = "";
        String s4 = "How are you?";
        System.out.println(s4.startsWith("How"));
        System.out.println(s4.endsWith("you"));

        String s5 = s4.substring(4);
        System.out.println(s5);
        s5 = s4.substring(4,7);
        System.out.println(s5);

        String s6 = "  How old are YOU!!!  ";
        String s7 = s6.trim();
        System.out.println(s7);
        System.out.println(s6);
    }
}
