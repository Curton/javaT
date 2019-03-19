package com.company;

class Main {

    public static void main(String[] args) {

        // new Thread(() -> run("MyThread 1.")).start();
        // new Thread(() -> run("MyThread 2.")).start();

        // MyPalindrome.test();

        Shellsort.test();
    }

    private static void run(String str) {
        System.out.println(str);
    }


}