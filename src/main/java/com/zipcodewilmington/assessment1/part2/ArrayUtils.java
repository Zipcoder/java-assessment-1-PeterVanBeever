package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.util.stream.Stream;

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
       int len = objectArray.length-1;
       int maxcount = 0;
       int mostFreqElement = 0;
       for (int i = 0; i < len; i++){
           int count = 0;
           for (int j = 0; j < len; j++){
               if (objectArray[i] == objectArray) {
                   count++;
               }
           }
           if (count > maxcount) {
               maxcount = count;
               mostFreqElement = (int) objectArray[i];
           }
       }
        return mostFreqElement;
        //return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {


        return null;
    }
}
