package com.hsq.test;

import java.util.Random;

public class TestRandom
{
    public static void main(String[] args)
    {
        int count = 6;
        Random r = new Random();
        for(int i =0;i<count;i++)
        {
            if (count <= 6)
            {
                System.out.print(r.nextInt(32)+"\t");
            }
        }
        System.out.println(r.nextInt(16));
    }
}
