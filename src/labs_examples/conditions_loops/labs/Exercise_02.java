package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner day = new Scanner(System.in);

        // 2) prompt user
        System.out.println("Enter a number between 1 and 7 : ");
        // 3) assign input to variable as int
        int d = day.nextInt();

        // 4) write completed code here
        if (d == 1){
            System.out.println("Monday");
        } else if (d == 2){
            System.out.println("Tuesday");
        } else if (d == 3){
            System.out.println("Wednesday");
        } else if (d == 4){
            System.out.println("Thursday");
        } else if (d == 5){
            System.out.println("Friday");
        } else if (d == 6){
            System.out.println("Saturday");
        } else if (d == 7){
            System.out.println("Sunday");
        } else if (d == 0 || d > 7) {
            System.out.println("Other");
        }

    }
}
