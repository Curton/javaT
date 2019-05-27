package com.company;

public class Max {
    public static int getMax(int v1, int v2, int v3) {
        // Nesting of ternary operations
        return v1 > v2 ? (v1 > v3 ? v1 : v3) : (v2 > v3 ? v2 : v3);
    }
}
