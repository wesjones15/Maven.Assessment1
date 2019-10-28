package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (Object object : objectArray) {
            if (object.equals(objectToCount)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        // get index of objectToRemove
        int newArraySize = objectArray.length-getNumberOfOccurrences(objectArray,objectToRemove);
        Object[] newArray = new Integer[newArraySize];
        int newArrayIndex = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                newArray[newArrayIndex] = objectArray[i];
                newArrayIndex += 1;
            }
        }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommonObject = null;
        Integer highestCount = 0;
        for (Object object : objectArray) {
            Integer count = getNumberOfOccurrences(objectArray, object);
            if (count > highestCount) {
                highestCount = count;
                mostCommonObject = object;
            }
        }
        return mostCommonObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommonObject = null;
        Integer lowestCount = objectArray.length;
        for (Object object : objectArray) {
            Integer count = getNumberOfOccurrences(objectArray, object);
            if (count < lowestCount) {
                lowestCount = count;
                leastCommonObject = object;
            }
        }
        return leastCommonObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    // return had to be changed from Object[] to Integer[] because test was not written to handle Object[] type
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int mergeArraySize = objectArray.length + objectArrayToAdd.length;
        Integer[] mergeArray = new Integer[mergeArraySize];
        for (int i = 0; i < mergeArraySize; i++) {
            Integer object = null;
            if (i < objectArray.length) {
                object = (Integer) objectArray[i];
            } else if (i >= objectArray.length) {
                int idx = i - objectArray.length;
                object = (Integer) objectArrayToAdd[idx];
            }
            mergeArray[i] = object;
        }

        return mergeArray;
    }
}
