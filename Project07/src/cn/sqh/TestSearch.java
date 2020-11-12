package cn.sqh;

import java.util.Arrays;

public class TestSearch {
    public static void main(String[] args) {
        int[] a = {1,123,2,321,565,75,74,21,11};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(BinarSearch(a,21));
        }
        public static int BinarSearch(int[] a,int value){
            int low = 0;
            int high = a.length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(a[mid]==value){
                    return mid;
                }
                if(value > a[mid]){
                    low = mid+1;
                }
                if(value < a[mid]){
                   high = mid-1;
                }
        }
            return -1;
    }
}
