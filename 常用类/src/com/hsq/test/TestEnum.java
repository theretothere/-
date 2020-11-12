package com.hsq.test;

/**
 * enum 这个类型包括 枚举声明和枚举体
 *
 * 当需要定义一组敞亮的时候，可以使用枚举类型
 *
 * 尽量不要使用枚举的高级特性，高级特性可以使用普通类来实现，没有引入梅菊德必要，增加程序的复杂性
 *
 * 每一个实例  都是默认是由public static final进行修饰
 */

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);

        Season a = Season.AUTUMN;

        switch(a){
            case SPRING:
                System.out.println("chuntianlail ");
            case SUMMER:
                System.out.println();
            case AUTUMN:
                System.out.println();
            case WINTER:
                System.out.println("");
        }
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
enum Week{
    星期一,星期二,星期三,星期四,星期五,星期六,星期天
}