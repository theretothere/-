package cn.hsq.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化类
 *
 * TestDateFormat  将时间对象转化成字符串类
 *或者将字符创类转换成时间
 *
 * DateFormat是抽象类，  通常实现是使用 SimpleDateFormat
 *
 *
 */
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date());
        System.out.println(str);

    }
}
