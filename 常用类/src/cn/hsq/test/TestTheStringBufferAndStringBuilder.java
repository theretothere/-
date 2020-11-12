package cn.hsq.test;

/**
 * StringBuffer和StringBuilder 部分方法参见String
 *
 * 这里使用的方法 与 String方法不一样
 *
 * 实验了部分常用的方法
 */

public class TestTheStringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        for(int i =0;i<26;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);

        sb.reverse();//倒叙
        System.out.println(sb);

        sb.setCharAt(3,'胡');
        System.out.println(sb);
        sb.insert(0,'我');
        //insert方法可以使用链式调用 ，因为使用了return this的方法，将自己返回了
        System.out.println(sb);

        sb.delete(20,23);
        System.out.println(sb);
    }
}
