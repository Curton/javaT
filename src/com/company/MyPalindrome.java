package com.company;

class MyPalindrome {

    public static boolean check(String str) {
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

    public static void test() {
        for (int m = 0; m < 1000000; m++)
            if (check(String.valueOf(m))) {
                System.out.println(m);
            }
    }
}
