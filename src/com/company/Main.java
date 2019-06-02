package com.company;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        // new Thread(() -> run("MyThread 1.")).start();
        // new Thread(() -> run("MyThread 2.")).start();

        // MyPalindrome.test();

        // ShellSort.test();

        // The default integer type in Java is int
        // System.out.println(Integer.MAX_VALUE + 1);

        // test Max
        /*
        int a = 7, b = 5, c = 3;
        int max = Max.getMax(a, b, c);
        System.out.println(max);
        */

        /*
        // Error:(25, 21) java: 不兼容的类型: 从long转换到int可能会有损失
        long num = 100;
        int x = num + 2;
        System.out.println(x);
        */

        /*
            // string + operation:

        int x = 10;
        double y = 20.2;
        long z = 10L;
        String string = "" + x + y * z;
        System.out.println(string);

         */

        /*
            // int overflow
        int num = 2147483647;
        num += 2L;
        System.out.println(num);
        System.out.println(getType(num));

         */

        /*
        boolean flag = 10 % 2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
        System.out.println(flag);
         */

        // Integer integer = new Integer(0);

        // 10 -> 00001010 ~> 11110101
        /*
        int j = 1;
        System.out.println(~j);
        int i = -1;
        System.out.println(~i);
        int k = 0x100000;
        System.out.println(k);
        int m = 50;
        int[] intA = new int[m];
        intA[49] = 1;
        System.out.println(intA[5]);
        System.out.println(intA[49]);
        */

        System.out.println(Arrays.toString(Primes.getPrimes(1000)));

        // System.out.println(Arrays.toString(Primes.Primes(100000)));



    }

    private static String getType(Object o) {
        return o.getClass().toString();
    }

    private static void run(String str) {
        System.out.println(str);
    }


}