package cn.hsq.test;

/**
 * 在使用循环累加字符串的时候，要使用StringBuilder来进行
 */
public class TestSomeTrap {
    public static void main(String[] args) {
        //使用String进行字符串的拼接
        String str = " ";
        //本质上使用StringBuilder拼接，但是每次循环都会产生一个StringBuilder对象
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            str = str + i;//相当于产生了10,000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();//获得系统剩余的空间
        long time2 = System.currentTimeMillis();//获得系统当前的时间
        System.out.println("String占用的空间："+(num1- num2));
        System.out.println("String使用的时间："+(time2-time1));

        //使用String进行字符串的拼接
        StringBuilder sb1 = new StringBuilder();
        //本质上使用StringBuilder拼接，但是每次循环都会产生一个StringBuilder对象
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            sb1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用的空间："+(num3 - num4));
        System.out.println("StringBuilder使用的时间："+(time4-time3));


    }
}
