package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

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
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
            //Object[] newArray = ArrayUtils.remove
//        int i, j;
//        for (i = 0, j =0; j < objectArray.length; j++) {
//            //check if jth object is not equal to objectToRemove
//            if (!objectArray[j].equals(objectToRemove)) {
//                objectArray[i++] = objectArray[j];
//            }
//            //copy array
//            objectArray = Arrays.copyOf(objectArray, i);
//            //return outcome;
//            for (int index = 0; index < objectArray.length; index++) {
//            String finalArray =  objectArray[index];
//            }
//        }
//        return objectArray;
        return null;


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
