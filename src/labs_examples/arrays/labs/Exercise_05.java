package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        //creating and populating a string array called names.
        String[] names = {"tiffany", "april", "brenda", "ashley", "john", "cory", "shawn", "bob"};

        //starting with the last element in names, iterating and printing every other element in reverse order.
        for (int a = names.length - 1; a >= 0; a-=2){
            System.out.println(names[a]);

        }

    }

}
