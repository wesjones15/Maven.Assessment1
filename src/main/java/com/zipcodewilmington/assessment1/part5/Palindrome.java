package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        // get all possible substrings
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (isPalindromic(input.substring(i,j+1))) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public boolean isPalindromic(String input) {
        boolean is_palindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() -1-i)) {
                is_palindrome = false;
            }
        }
        return is_palindrome;
    }
}
