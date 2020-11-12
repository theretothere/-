public class HomeWork02 {
    public static void main(String[] args) {
        int[] a = {5,23,13,24,14};
        System.out.println(sum(a));
    }
    public static int sum(int[] n){
        int sum = 0;
        for(int i = 0; i < n.length ; i++){
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
            //	at HomeWork02.sum(HomeWork02.java:9)
            //	at HomeWork02.main(HomeWork02.java:4)
            sum += n[i];
        }
        return sum;
    }
}
