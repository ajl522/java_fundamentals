package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String []args){
        System.out.println("Enter a number for the month of the year: ");

        Scanner month = new Scanner(System.in);
        int m = month.nextInt();


            switch (m) {
            case 1: System.out.println("January");
            return;
            case 2 : System.out.println("February");
            return;
            case 3 : System.out.println("March");
            return;
            case 4 : System.out.println("April");
            return;
            case 5 : System.out.println("May");
            return;
            case 6 : System.out.println("June");
            return;
            case 7 :System.out.println("July");
            return;
            case 8 :System.out.println("August");
            return;
            case 9 :System.out.println("September");
            return;
            case 10 :System.out.println("October");
            return;
            case 11 :System.out.println("November");
            return;
            case 12 :System.out.println("December");
            return;
                default : System.out.println("Other");
        }

    }

}
