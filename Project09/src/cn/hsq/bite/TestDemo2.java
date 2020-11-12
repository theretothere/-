package cn.hsq.bite;

public class TestDemo2
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 20;
        int z = 30;
        if(z>i&&z>j){
            System.out.println("最大值为：z,z = "+ z);
            if(i>j){
                System.out.println("最小值为：j,j = "+ j);
            }else{
                System.out.println("最小值为：i,i = "+ i);
            }
        }
        if(i>j&&i>z){
            System.out.println("最大值为：i,i = "+ i);
            if(j>z){
                System.out.println("最小值为：z,z = "+ z);
            }else{
                System.out.println("最小值为：j,j = "+ j);
            }
        }
        if(j>i&&j>z){
            System.out.println("最大值为：j,j = "+ j);
            if(i>z){
                System.out.println("最小值为：z,z = "+ z);
            }else{
                System.out.println("最小值为：i,i = "+ i);
            }
        }
    }
}
