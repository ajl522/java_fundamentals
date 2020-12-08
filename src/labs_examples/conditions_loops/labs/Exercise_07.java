package labs_examples.conditions_loops.labs;


import java.util.Locale;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String []args){

        System.out.println("Enter a word : ");

        Scanner sc = new Scanner(System.in);
        String scan = sc.next();
        String test = scan.toLowerCase();
        int x = 0;


        while (x < test.length()) {
            char a = test.charAt(x);
                if (a == 'a'){
                    System.out.println("The first vowel of " + scan + " is a.");
                    return;
                }
            if (a == 'e'){
                System.out.println("The first vowel of " + scan + " is e.");
                return;
            }
            if (a == 'i'){
                System.out.println("The first vowel of " + scan + " is i.");
                return;
            }
            if (a == 'o'){
                System.out.println("The first vowel of " + scan + " is o.");
                return;
            }
            if (a == 'u'){
                System.out.println("The first vowel of " + scan + " is u.");
                return;
            }
            x++;
        }


    }
}
