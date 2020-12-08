package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String []args){

        for (int x = 0; x < 10; x++){
            System.out.println(x);

            //when x reaches 4, the loop will add 1 to skip 5 and continue to the next iteration.

            if (x == 4){
                x++;
                continue;
            }

        }
    }
}
