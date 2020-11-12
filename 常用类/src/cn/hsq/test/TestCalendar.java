package cn.hsq.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        //获得日期的相关元素
        Calendar calendar = new GregorianCalendar(2020,16,26,35,15253,2355);
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);//0~11表示的是月份 0对应1月 以此类推
        int week = calendar.get(Calendar.DAY_OF_MONTH);//星期几
        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
        System.out.println(week);
        //设置日期
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.YEAR,8012);
        System.out.println(c2);

        //日期的计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.DATE,100);
        System.out.println(c3);

        // 日期对象和事件对象的转化
        Date d4 = c3.getTime();
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());

        paintCalendar(c4);
        Dog d = new SmallDog();
        d.shout();
    }
    public static void paintCalendar(Calendar c){
        //打印简单的格式
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;
        String dayweek2 = dayweek == 0?"日":dayweek+"";

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒"+" 周"+dayweek2);

    }
}

abstract class Dog{
    public void shout(){
        System.out.println("嗷呜汪");
    }
}

class SmallDog extends Dog{
    public void shout(){
        System.out.println("嗷呜汪。。。。");
    }
}