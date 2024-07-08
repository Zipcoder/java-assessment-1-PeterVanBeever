package com.zipcodewilmington.assessment1.part4;
import java.util.Arrays;
public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        //jumpheight j
        //flagheight k

        int fullJumps = k / j;

        int remainingHeight = k % j;

        return fullJumps + remainingHeight;


        //return -1;

    }
    // k
    // j



}
