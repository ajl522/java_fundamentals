package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String []args){

        System.out.println("Enter lower limit :");

        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Enter upper limit :");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int c = 0;
        int d = a - (b - 1);

        for (c = 0; b <= a; b++){
            c += b;
        }

        System.out.println("The sum is : " + c);

        double e = new Double(c);
        double f = new Double(d);
        double g = e/f;

        System.out.println("The average is : " + g);

    }
}
