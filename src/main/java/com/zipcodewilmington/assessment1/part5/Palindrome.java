package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int strLength = input.length();// all single characters in string are treated as palindromes.
        int count = strLength;
        for(int i=0; i<strLength; i++) {
            for(int j=i+2; j<=strLength; j++) {
                String value = input.substring(i, j);
                String reverse = new StringBuilder(value).reverse().toString();
                if(value.equals(reverse)) {
                    count++;
                }
            }
        }
        return count;
        //return null;
    }
}
