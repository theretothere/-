public class HomeWork03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] n = transform(a);
        for (int x: n) {
            System.out.print(x + " ");
        }
    }
    public static int[] transform(int[] n){
        int[] tmp = n;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = n[i] * 2;
        }
        return tmp;
    }
}
