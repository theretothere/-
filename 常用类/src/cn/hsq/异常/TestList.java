package cn.hsq.异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        test03();
    }
    public static void test01(){
        Collection<String> c = new ArrayList<String>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("猪一戒");
        c.add("猪二戒");
        c.add("猪三戒");
        System.out.println(c);
    }
    public static void test02(){
        List<String> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println(list01);
        list02.add("cc");
        list02.add("aa");
        list02.add("dd");
        System.out.println(list02);

//        list01.addAll(list02);
//        list01.removeAll(list02);
//        list01.retainAll(list02);
        System.out.println(list01);
        System.out.println(list01.contains(list02));
    }
    public static void test03(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        if(list!=null && list.size()>0){
            list.get(2);
            System.out.println(list);
        }
        list.remove(2);
        System.out.println(list);

        list.set(3,"C");
        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));
    }
}
