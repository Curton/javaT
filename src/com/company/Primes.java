package com.company;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Covey
 */

public class Primes {
    public static int[] getPrimes(int range) {

        if (range <= 1) {
            return new int[]{};
        }

        boolean[] primesMatrix = new boolean[range + 1];
        // set all value as TRUE
        Arrays.fill(primesMatrix, true);
        // set 0, 1, 2 as 0, 0, 1
        primesMatrix[0] = false;
        primesMatrix[1] = false;
        primesMatrix[2] = true;
        // start with 2
        int nextCheckValue = 2;
        while (nextCheckValue <= range / 2) {
            // check whether current value is prime
            if (primesMatrix[nextCheckValue]) {
                // marks
                if (2 * nextCheckValue <= range) {
                    for (int i = 2 * nextCheckValue; i <= range; i += nextCheckValue) {
                        primesMatrix[i] = false;
                    }
                }

            }
            // move to the next number
            nextCheckValue++;
        }

        Vector<Integer> primes = new Vector<>();
        int index = 0;
        for (boolean value : primesMatrix) {
            if (value) {
                primes.add(index);
            }
            index++;
        }

        int len = primes.size();

        int[] primesArray = new int[len];
        int i = 0;
        for (; i < len; i++) {
            primesArray[i] = primes.get(i);
        }

        return primesArray;
    }
}
