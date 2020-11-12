import java.util.Scanner;

public class Person {
    public String Name;
    public String ID;
    public int Grade;
    public void Change(int count){
        System.out.println("请输入相关的数字");
        int[] a = {1,12,34,4,5,6,67,5634,45};
        int[] b = new int[10];
        b = new int[]{11,1,12,12312,213,12,312,132};
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<a.length;i++){
            if(i>(a.length/2)){
                for(int j=1;j<=(a.length/2);j++){
                    int[] temp = new int [10];
                    temp[i] = a[i];
                    a[i] = b[i];
                    b[i] = temp[i];
                    System.out.println(a[i]);
                    System.out.println(b[i]);
                }
            }else{
                System.out.println("");
            }

        }
    }
}
