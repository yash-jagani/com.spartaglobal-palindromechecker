package org.spartaglobal.palindromechecker;

import static org.spartaglobal.palindromechecker.PalindromeCheck.isPalindrome;

public class PalindromePrinter {
    public static void printResult(String word){
        System.out.println(isPalindrome(word));
    }
}
