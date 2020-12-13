package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int [][] irRegular = {
                {36,42,15},
                {108,22,7,13},
                {13},
                {581, 62, 109, 222, 45, 37}
        };

        for (int a = 0; a < irRegular.length; a++){
            for (int b = 0; b < irRegular[a].length; b++){
                System.out.print(irRegular[a][b] + " | ");
            }
            System.out.println();
        }
    }

}
