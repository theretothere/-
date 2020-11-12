public class HomeWork05 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i = 0;i < a.length; i++){
            a[i] = i+1;
        }
        for (int x: a) {
            System.out.print(x + " ");
        }
    }
}
