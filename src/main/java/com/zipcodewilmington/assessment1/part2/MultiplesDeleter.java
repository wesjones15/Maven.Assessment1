package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {

    public Integer getNumWithoutRemainders(Integer[] ints, Integer numToCheck) {
        int count = 0;
        for (Integer num : ints) {
            if (num % numToCheck == 0) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer oddArraySize = ints.length - getNumWithoutRemainders(ints, 2);
        Integer[] oddArray = new Integer[oddArraySize];
        int idx = 0;
        for (Integer num : ints) {
            if (num % 2 != 0) {
                oddArray[idx] = num;
                idx += 1;
            }

        }
        return oddArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer evenArraySize = getNumWithoutRemainders(ints, 2);
        Integer[] evenArray = new Integer[evenArraySize];
        int idx = 0;
        for (Integer num : ints) {
            if (num % 2 == 0) {
                evenArray[idx] = num;
                idx += 1;
            }

        }
        return evenArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return deleteMultiplesOfN(ints, 3);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer idx = 0;
        Integer newArraySize = ints.length - getNumWithoutRemainders(ints, multiple);
        Integer[] newArray = new Integer[newArraySize];
        for (Integer num : ints) {
            if (num % multiple != 0) {
                newArray[idx] = num;
                idx++;
            }
        }
        return newArray;
    }
}
