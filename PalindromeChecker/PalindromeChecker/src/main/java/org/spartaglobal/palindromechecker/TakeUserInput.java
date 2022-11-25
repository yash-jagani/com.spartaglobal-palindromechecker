package org.spartaglobal.palindromechecker;

import java.util.Scanner;
import static org.spartaglobal.palindromechecker.RemoveInvalidInputs.removeInvalid;

public class TakeUserInput {
    public static void takeInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word to test for palindrome: ");
        String word = in.nextLine().toLowerCase();
        removeInvalid(word);
    }
}
