package app05_decimal_comparator;

public class DecimalComparator {

     /*  Challenge: Decimal Comparator

         Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

         The method should return boolean and it needs to return true if two double
            numbers are the same up to three decimal places. Otherwise return false.

         Examples of input/output:
         - areEqualByThreeDecimalPlaces(-3.1766,-3.175);
            should return true since numbers are equal to 3 decimal places
         - areEqualByThreeDecimalPlaces(3.175, 3.176);
            should return false since numbers are not equal up to 3 decimal places
         - areEqualByThreeDecimalPlaces(3.0, 3.0);
            should return true since numbers are equal up to 3 decimal places
     */

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.1755));  // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));      // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));          // true
    }

    public static boolean areEqualByThreeDecimalPlaces(double leftSide, double rightSide) {

        int leftNumber = (int)(leftSide * 1000);
        int rightNumber = (int)(rightSide * 1000);

        if (leftNumber == rightNumber)
            return true;
        else
            return false;
    }
}