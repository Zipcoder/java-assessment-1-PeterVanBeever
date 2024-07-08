package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int N = n;
        int sum = 0;
        for (int i =1; i <=N;i++){
            sum +=i;
        }
        return sum;
        //return null;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        long outcome = 1;
        for (int factor = 2; factor <= n; factor++) {
            outcome *= factor;
        }
        return Math.toIntExact(outcome);
        //return null;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
            int reverse = 0;
            while (val !=0){
                reverse = reverse * 10 + val % 10;
                val/=10;
            }
            return reverse;
//        int digits = val;
//        StringBuilder newDigits = new StringBuilder(String.valueOf(digits));
//        digits = newDigits.reverse();

        //return null;
    }
}
