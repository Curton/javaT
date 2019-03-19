package com.company;

public class Main {

    public static void main(String[] args) {
        for (int m = 0; m < 1000000; m++)
            if (Mos(String.valueOf(m))) {
                System.out.println(m);
            }

        new Thread(() -> run("MyThread 1.")).start();

        new Thread(() -> run("MyThread 2.")).start();
    }

    private static void run(String str) {
        System.out.println(str);
    }

    private static boolean Mos(String str) {
        int len = str.length();

        if (len <= 1) {
            return true;
        }

        for (int i = 0; i < len; i++) {
            int j = len - i - 1;

            if (j == i) {
                return str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(j + 1);
            }
            if (j < i) {
                return true;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return false;
    }
}