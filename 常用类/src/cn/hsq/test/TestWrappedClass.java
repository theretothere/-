package cn.hsq.test;

/**
 * Integer类的使用
 * 其余的类均类似于Integer
 *
 * 包装类提供了    基本数据类型    包装类    字符串    这三者之间的转化
 */
public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对象
        Integer a = new Integer(10);
        Integer b = Integer.valueOf(30);

        //把包装类转换成基本数据类型
        int c = b.intValue();//手动转换
        double d = b.doubleValue();

        //把字符串转换成包装类对象
        Integer e = new Integer("9999");//NumberFormatException 不是数字格式
        System.out.println(e);
        Integer f = Integer.parseInt("99999888");

        //把包装类对象转换成字符串
        String str = f.toString();//""+f

        //常见的常量
        System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
        System.out.println("int类型最小的整数："+Integer.MIN_VALUE);
    }
}
