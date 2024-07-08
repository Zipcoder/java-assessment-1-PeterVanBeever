package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        //char firstChar = str.toUpperCase(str.charAt(0);
        //String outcome = new StringBuilder(str).setCharAt(0, );
        String outcome = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        return outcome;
        //return null
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String outcome = new StringBuilder(str).reverse().toString();
        return outcome;
        //return null;
    }
    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String step1reverse = reverse(str);
        String step2camel = camelCase(step1reverse);
        return step2camel;
        //return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        //str = str.substring(1,str.length()-1);
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        sb.deleteCharAt(0);
        return sb.toString();
        // String outcome = str.replace(str.charAt(0),'');
       // return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}
