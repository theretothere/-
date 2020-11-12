package cn.hsq.test;

/**
 * String 对象被称为     “不可变对象”
 */
public class TestString {
    public static void main(String[] args) {
        //在进行String判断的时候使用的是equals方法
        //== 判断的是对象
        String str = "aaaaaa";
        String str2 = str.substring(3,5);
        System.out.println(str);
        System.out.println(str2);

        //在这里java编译器会对字符串进行拼接优化
        String str3 = "hello"+" java";
        String str4 = "hello java";
        System.out.println(str3==str4);//true

        //因为编译的时候不知道变量中存储的是什么值，所以在无法进行优化
        String str5 = "hello";
        String str6 = " java";
        String str7 = str5+str6;
        System.out.println(str7==str4);//false
    }
}
