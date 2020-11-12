package cn.hsq.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试Date类的常见用法
 *
 * 大多数均被取消了
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date d = new Date(2000);
        System.out.println(d);
        Date d2 = new Date();
        System.out.println(d2);
        System.out.println(d.after(d2));
        //以后遇到日期使用Canlendar类


        //把时间类对象按照“格式字符串指定的格式”转换成相应的字符串
        Date d3 = new Date(2020-1900,5,23);
        System.out.println(d3);

        //把字符串按照“格式字符串指定的格式”转换成相应的时间对象
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date df2 = df1.parse("1983-5-19 12:33:56");
        System.out.println(df2);

        DateFormat df3 = new SimpleDateFormat("D");

        String str4 = df3.format(new Date());
        System.out.println(str4);
    }
}
