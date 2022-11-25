package org.spartaglobal.palindromechecker;


import static org.spartaglobal.palindromechecker.PalindromePrinter.printResult;
import static org.spartaglobal.palindromechecker.TakeUserInput.takeInput;

public class RemoveInvalidInputs {
    public static void removeInvalid(String word){
        word = word.replaceAll("[^a-zA-Z0-9]", "");
        if (word.isBlank()){
            System.out.println("String only contains whitespaces or special characters!");
            takeInput();
        }else {
            printResult(word);
        }
        }
    }
