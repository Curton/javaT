package com.company;

/**
 * @Author CoveyLiu, covey@liukedun.com
 * @Date 2019-07-09 15:42
 */

public class ForeachTest {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println();
//        System.out.println(arr[0][0]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[2][0]);

        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.println(a);
            }
        }


    }

}
