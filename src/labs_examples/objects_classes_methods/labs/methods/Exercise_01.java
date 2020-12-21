package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int i = multiply(8,25);
        System.out.println("8 times 25 is: " + i);
        int f = divide(i, 20);
        System.out.println("i divided by 20 is: " + f);
        joke();
        long t = yearsToSeconds(1);
        System.out.println("The number of seconds in a year is: ");
        System.out.println(t);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Come here, let me show you something..... ");
        System.out.println(".........");
        System.out.println("burrrrghhh......ah man, what was that");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years){
        return years * 365 * 24 * 60 * 60;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int sCount(String...s){
        int a = 0;
        for (String g : s){
            a++;
        }
        return a;
    }






}
