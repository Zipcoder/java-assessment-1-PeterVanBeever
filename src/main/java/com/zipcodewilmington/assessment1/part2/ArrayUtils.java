package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
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
        // loop through
        int counter = 0;
        for (int i = 0; i <objectArray.length; i++) {
            // conditional
            if (objectArray[i].equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
        //return null;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        int x = 0;
        for (int i =0; i <objectArray.length; i++){
            //check if element i matches value
            //use ! to reverse the locic equals
            if (!objectArray[i].equals(objectToRemove)) {
                //if no match to remove, go to next array element
                x++;
            }
        }
        //create empty fixed array
        Integer[] fixedArray = new Integer[x];
        int y = 0;
        //build array with a loop
        for (int i=0; i<objectArray.length;i++){
            if (!objectArray[i].equals(objectToRemove)){
                //as long as no match to remove
                fixedArray[y++] = objectArray[i];
            }
        }
        return fixedArray;
        //return null;


    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int mostFrequent = (int) objectArray[0];
        int maxCount = 0;

        for (int i = 0; i < objectArray.length; i++) {
            int num = (int) objectArray[i];
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);

            if (count > maxCount) {
                mostFrequent = num;
                maxCount = count;
            }
        }
        return mostFrequent;
        //return null;
    }
    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Integer[] objectArray) {
        int n = objectArray.length;
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxElement = 0, minElement = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (objectArray[i] == objectArray[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxElement = objectArray[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minElement = objectArray[i];
                minFreq = count;
            }
        }
        return minElement;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int x = objectArray.length;
        int y = objectArrayToAdd.length;
        Integer[] mergeArray = new Integer[x + y];

        System.arraycopy(objectArray, 0, mergeArray, 0, x);
        System.arraycopy(objectArrayToAdd, 0, mergeArray, x, y);

        System.out.println(Arrays.toString(mergeArray));
        return mergeArray;
        //return null;
    }
}
