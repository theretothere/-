package cn.hsq;

/**
 * String 被称为 不可变字符序列
 */

public class TestString1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String ("dsafsd");
        String str3 = "abc"+"defghijklmn";
        String str4 = "18"+19;
        System.out.println("#####################");

        String str10 = "husu";
        String str11 = "husu";
        String str12 = new String ("husu");
        System.out.println(str10 == str11);
        System.out.println(str10 == str12);//str11和str12 不是同一个对象

        //通常比较字符串的时,使用equals方法
        System.out.println(str11.equals(str12));
    }
}
