package cn.hsq;

public class TestJiuJiuChengFaBiao {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int x = 0;x<=100;x++){
            if(x%2==0){
                sum1+=x;
            }else{
                sum2+=x;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        int j=0;
        //用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
        for(int i=1;i<=1000;i++){
            //int j=0;
            if(i%5==0){
                System.out.print(i+"\t");
                j++;
            }
            if(j==5){
                System.out.println();
                j=0;
            }
        }
        int y=0;
        for(int x =100;x<=150;x++){
            if(x%3==0){
                System.out.print(x+"\t");
                y++;
            }
            if(y%5==0){
                System.out.println();
            }
        }

    }
}
