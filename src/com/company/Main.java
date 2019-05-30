package com.company;

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

    }

    private static void run(String str) {
        System.out.println(str);
    }


}