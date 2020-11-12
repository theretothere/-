//package cn.hsq.异常;
//
//public class TestGeneric {
//    public static void main(String[] args) {
//        Mycollection<String> mc = new Mycollection<>();
//        mc.set("张思琦",0);
//        mc.set(9999,1);
//
//        Integer c = (Integer)mc.get(1);
//        String s = (String) mc.get(1);
//    }
//}
//
//class MyCollection <E>{//泛型需要加<>,在<>内一般使用 T E V 这三个字母
//    //代表的是后期要传递的类型
//    Object[] objs = new Object[5];
//    public void set(Object obj,int index){
//        objs[index] = obj;
//    }
//
//    public Object get(int index){
//        return objs[index];
//    }
//}
