package org.spartaglobal.palindromechecker;

public class PalindromeCheck {
    public static String isPalindrome(String word){
        String inReverse = "";
        for (int i = word.length()-1; i >= 0; i--){
            inReverse += word.charAt(i);
        }
        if (word.equals(inReverse)){
            return word + " " + "is a palindrome";
        }else{
            return word + " " + "is not a palindrome";
        }
    }
}
