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
        String firstChar = String.valueOf(str.charAt(0)).toUpperCase();
        String restOfString = str.substring(1,str.length());
        return firstChar + restOfString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder invertedStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String element = String.valueOf(str.charAt(i));
            if (element.equals(element.toUpperCase())) {
                // char is uppercase
                invertedStr.append(element.toLowerCase());
            } else if (element.equals(element.toLowerCase())) {
                invertedStr.append(element.toUpperCase());
            }
        }
        return invertedStr.toString();
    }
}
