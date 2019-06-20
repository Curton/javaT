package com.company;

import java.util.Arrays;

/**
 * @author covey
 */

public class ShellSort {

    public static void sort(int[] array) {
        sortAsc(array);
    }

    public static void sortAsc(int[] array) {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) {
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

    public static void sortDes(int[] array) {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] < temp) {
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

    public static void test() {

        int[] array = new int[] {5, 7, 2, 3, 9, 8, 0, 4, 1, 6};

        System.out.println("Before shellsort : " + Arrays.toString(array));
        sort(array);
        System.out.println("After shellsort : " + Arrays.toString(array));
        sortDes(array);
        System.out.println("After shellsort : " + Arrays.toString(array));

    }
}
