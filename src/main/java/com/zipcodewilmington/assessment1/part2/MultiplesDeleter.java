package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
       int count =0;
       for (Integer num : ints){
           if (num % 2 !=0){
               count++;
           }
       }
       Integer[] outcome = new Integer[count];
       int index = 0;
       for (Integer num : ints){
           if (num %2!=0){
               outcome[index++] = num;
           }
       }
        return outcome;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int count = 0;
        for (Integer num : ints) {
            if (num %2 == 0) {
                count++;
            }
        }
        Integer[] outcome = new Integer[count];
        int index = 0;
        for (Integer num : ints) {
            if (num % 2 ==0) {
                outcome[index++] = num;
            }
        }
        return outcome;
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int count = 0;
        //for each...
        for (Integer num : ints){
            //divisible by 3
           if (num %3!=0){
               count++;
           }
        }
        Integer[] outcome = new Integer[count];
        int index =0;
        // for each in array ints
        for (Integer num : ints){
            if (num %3 !=0){
                outcome[index++]=num;
            }
        }
        return outcome;
        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int count = 0;
        //for each...
        for (Integer num : ints){
            //divisible by 3
            if (num %multiple!=0){
                count++;
            }
        }
        Integer[] outcome = new Integer[count];
        int index =0;
        // for each in array ints
        for (Integer num : ints){
            if (num %multiple !=0){
                outcome[index++]=num;
            }
        }
        return outcome;
        //return null;
    }
}
