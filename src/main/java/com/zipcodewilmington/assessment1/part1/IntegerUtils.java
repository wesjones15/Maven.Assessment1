package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    // The tests are looking for all integers INCLUDING n,
    // so methods changed accordingly
    public static Integer getSumOfN(Integer n) {
        Integer acc = 0;
        for (int i = 0; i <= n; i++) {
            acc += i;
        }
        return acc;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer acc = 1;
        for (int i = 1; i <= n; i++) {
            acc *= i;
        }
        return acc;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        return Integer.valueOf(BasicStringUtils.reverse(String.valueOf(val)));
    }
}
