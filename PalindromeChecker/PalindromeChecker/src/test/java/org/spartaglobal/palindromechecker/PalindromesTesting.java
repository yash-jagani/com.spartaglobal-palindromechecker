package org.spartaglobal.palindromechecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.spartaglobal.palindromechecker.PalindromeCheck.isPalindrome;


class TestForPalindromes {
    @ParameterizedTest
    @DisplayName("This method takes a string and returns a message saying it is a palindrome if this is the case")
    @ValueSource (strings = { "racecar", "radar", "kayak", "rotor", "121", "11", "5"})
    void checkCorrectPalindromes(String string){
        String expected = string + " " + "is a palindrome";
        Assertions.assertEquals(expected, isPalindrome(string));
    }

    @ParameterizedTest
    @DisplayName("This method takes a string and returns a message saying it is not a palindrome if this is the case")
    @ValueSource (strings = { "johnsmith", "pasta", "bagel", "motor", "1234", "7534", "64"})
    void checkIncorrectPalindromes(String string){
        String expected = string + " " + "is not a palindrome";
        Assertions.assertEquals(expected, isPalindrome(string));
    }


}