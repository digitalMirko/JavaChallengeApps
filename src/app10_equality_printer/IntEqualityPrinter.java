package app10_equality_printer;

public class IntEqualityPrinter {

    /*  Challenge: Create a Equality Printer
        Write a method printEqual with 3 parameters of type int.
            The method should not return anything(void)
        If one of the parameters is less than 0, print "Invalid Value"
        If all of the numbers are equal print text "All numbers are equal"
        If all of the numbers are different print text "All numbers are different"
        Otherwise print "Neither all are equal or different.

        Examples of Input/Output
        - printEqual(1,1,1); should print text All numbers are equal
        - printEqual(1,1,2); should print text Neither all are equal or different
        - printEqual(-1,-1,-1); should print text Invalid Value
        - printEqual(1,2,3); should print text All numbers are different
     */

    public static void main(String[] args) {
        printEqual(1,1,1);    //  All numbers are equal
        printEqual(1,1,2);    //  Neither all are equal or different
        printEqual(-1,-1,-1); //  Invalid Value
        printEqual(1,2,3);    //  All numbers are different
        printEqual(2,1,1);    //  Neither all are equal or different
    }

    public static void printEqual(int a, int b, int c){
        if ((a < 0) || (b < 0) || (c < 0)){
            System.out.println("Invalid Value");
        } else if ((a == b) && (b == c)) {
            System.out.println("All numbers are equal");
        } else if((a == b) && (a != c) || (a != b) && (b == c) || (a == c) && (b != c)) {
            System.out.println("Neither all are equal or different");
        } else if ((a != b) && (a != c) ){
            System.out.println("All numbers are different");
        }
    }
}
