package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Scanner nums1 = new Scanner(System.in);
        int a = nums1.nextInt();
        Scanner nums2 = new Scanner(System.in);
        int b = nums2.nextInt();
        Scanner nums3 = new Scanner(System.in);
        int c = nums3.nextInt();
        Scanner nums4 = new Scanner(System.in);
        int d = nums4.nextInt();
        Scanner nums5 = new Scanner(System.in);
        int e = nums5.nextInt();
        Scanner nums6 = new Scanner(System.in);
        int f = nums6.nextInt();
        Scanner nums7 = new Scanner(System.in);
        int g = nums7.nextInt();
        Scanner nums8 = new Scanner(System.in);
        int h = nums8.nextInt();
        Scanner nums9 = new Scanner(System.in);
        int i = nums9.nextInt();
        Scanner nums10 = new Scanner(System.in);
        int j = nums10.nextInt();

        int [] vars = {a, b, c, d, e, f, g, h, i, j};

        System.out.println("Your numbers are: ");
        System.out.println();

        for (int z = 0; z < vars.length; z++){
            System.out.print(vars[z] + " | ");
        }

        System.out.println();
        int x = 0;

        for (int y = 0; y < vars.length; y++){

            x += vars[y];

        }
        System.out.println();

        System.out.println("The sum of all numbers entered is : " + x);
        System.out.println();

        double u = new Double(x);
        u = u/10;

        System.out.println("The average of all numbers entered is: " + u);

    }

}