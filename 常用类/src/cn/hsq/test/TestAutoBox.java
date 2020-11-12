package cn.hsq.test;

/**
 * 测试装箱和拆箱(自动)
 */
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 24;//自动装箱。Integer a = Integer.valueOf(24);
        int b = a;//自动拆箱。编译器会自动修改成   int b = a.intValue();


        Integer c = null;
        if(c!=null){
            int d = c;//自动拆箱。c.intValue()
        }

        //Integer存在一个缓存机制  范围通常在[-128,127]之间
        //实际上就是系统初始化的时候，创建了一个[-128,127]的缓存数组
        //当我们调用ValueOf()的时候，首先检查是否在[-128,127]之间，
        //如果是在这个范围的话，直接从缓存数组中拿出已经建好的对象
        //如果不在这个范围内，则是创建新的Integer对象
        Integer in1 = Integer.valueOf(127);
        Integer in2 = Integer.valueOf(127);
        System.out.println(in1==in2);
        System.out.println(in1.equals(in2));
        System.out.println("##############");
        Integer in3 = Integer.valueOf(1234);
        Integer in4 = Integer.valueOf(1234);
        System.out.println(in3==in4);
        System.out.println(in3.equals(in4));

    }
}
