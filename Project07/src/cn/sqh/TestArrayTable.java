package cn.sqh;

import java.util.Arrays;

public class TestArrayTable {
    public static void main(String[] args) {
        Object[] o1 = {1001,"hs",18,"jiangshi","2020.6.8"};
        Object[] o2 = {1002,"wh",18,"shi","2010.6.8"};
        Object[] o3 = {1003,"sh",18,"jian","2023.6.8"};

        Object[][] TableDate = new Object[3][];
        TableDate[0] = o1;
        TableDate[1] = o2;
        TableDate[2] = o3;
        System.out.println(Arrays.toString(TableDate));
        System.out.println("###################################");
        for(Object[] temp:TableDate){
            System.out.println(Arrays.toString(temp));
        }
    }
}
