public class HomeWork01 {
    public static void main(String[] args) {
        int[] a = {5,10,15,20,25};
        System.out.println(avg(a));
    }
    public static int avg(int[] a){
        int sum = 0;
        int avg = 0;
        System.out.println(a);//在这里出现的是它的地址
        for(int j = 0 ; j < a.length;j++ ){//不可以写成 <= 5 会出现错误
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
            //	at HomeWork01.main(HomeWork01.java:11)
            sum += a[j];
        }
        avg = sum/a.length;
        return avg;
    }
}
