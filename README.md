# Palindrome Checker

This program was desinged to determine if a word is a palindrome (a word, phrase, or sequence that reads the same backwards as forwards).

Currently this is only working for String inputs and the implementation of Arrays as an input has not been implemented.

JUnit testing has been implemented for the isPalindrome method in the PalindromeCheck class.
Currently researching on how to implement testing on methods that call other methods instead of returning values.

```java
    public static void removeInvalid(String word){
        word = word.replaceAll("[^a-zA-Z0-9]", "");
        if (word.isBlank()){
            System.out.println("String only contains whitespaces or special characters!");
            takeInput();
        }else {
            printResult(word);
        }
        }
    ```
This demonstrates the method I used to validate the input from the user to ensure it could be passed to the isPalindrome() method.

```java
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
    ```
    
Below are the JUnit tests carried out demonstrating based on the string input, the function isPalindrome() is working correcty

```java
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
    ```
