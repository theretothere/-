package cn.hsq.bite;

public class Count {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;//偶数
        int num2 = 0;//奇数
        for(int i =1; i<=100 ; i++){
            if(i%2==0){
                    num1 +=i;
                System.out.println(num1);
            }else{
                    num2 +=i;
                }
                System.out.println(num2);
            }
            num = num1 + num2 ;
        System.out.println(num);
        }
    }
