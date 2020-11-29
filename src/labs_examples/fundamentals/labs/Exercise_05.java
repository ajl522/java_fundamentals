package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int x = str.length();
        System.out.println("The legnth of the string str is " + x);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean equalString = str.equalsIgnoreCase(str2);
        System.out.println("Are str & str2 the same? " + equalString);

        // please concatenate str & str2 and set the result to a new String variable below
        
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        String upstr = str.toUpperCase();
        System.out.println("str in all caps is " + upstr);
        System.out.println("My first program is called: " + str2.replace('h','H') + " World!");

    }


}