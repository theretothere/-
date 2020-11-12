/*这个类中所有的方法都是小练习*/
public class Demo {
//设计一个方法 用来交换两个数组的元素
// 方法是否需要参数及返回值  需要参数 提供两个数组 返回值？
    public void changeTwoArray(int[] a,int[] b){
        //2.交换数组中对应位置的元素
        //方法一、 将两个数组中的元素对应位置互换
        //方法二 将两个数组的地址直接互换
        int[] temp = b;
        b = a;
        a=temp;
    }

    public static void main(String[] args) {
        //1.拥有两个数组
        int[] a= {1,2,3,4};
        int[] b= {5,6,7,8,9,0};
        //方式一的设计问题在于
        //用循环的方式挨个交换数组内的元素 性能比较慢
        //交换的时候需要保证两个数组的长度是一致的
        //创建一个Demo对象
        Demo d = new Demo();
        //2.调用demo中的changeTwoArray方法
        d.changeTwoArray(a,b);
        //3.验证一下
        for(int v :a){
            System.out.println(v);
        }
        System.out.println("------------------------------");
        for(int v : b){
            System.out.println(v);
        }
    }
}
