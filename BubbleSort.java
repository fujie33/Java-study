package com.fujie.daily;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/20
 **/
public class BubbleSort {
    public static void bubbleSort1(int[] a,int n){
        int i;
        int j;
        for(i=1;i<n;i++){
            for(j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        BubbleSort.bubbleSort1(arr, arr.length);
        for (int i : arr) {
            System.out.println(i + ",");
        }
    }
}
