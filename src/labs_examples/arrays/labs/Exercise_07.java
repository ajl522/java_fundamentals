package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> exoticCars = new ArrayList();

        exoticCars.add ("Lamborghini Huracan");
        exoticCars.add ("Ferrari 488 Pista");
        exoticCars.add ("Aston Martin Vantage");
        exoticCars.add ("Bentley Continental GT");
        exoticCars.add ("BMW M8");
        exoticCars.add ("Mercedes AMG GT");
        exoticCars.add ("Bugatti Chiron");
        exoticCars.add ("McLaren 650");

        for (String s : exoticCars){
            System.out.println(s);
        }

    }
}
