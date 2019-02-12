package app06_equal_sum_checker;

public class EqualSumChecker {

    /*  Challenge: Equal Sum Checker
        Write a method hasEqualSum with 3 parameters of type int

        The method should return boolean and it needs to return true if sum
        of first and second parameter is equal to the third parameter.
        Otherwise return false.

        Examples of Input/Output:
        - hasEqualSum(1,1,1);  should return false since 1 + 1 is not equal to 1
        - hasEqualSum(1,1,2);  should return true since  1 + 1 is equal to 2
        - hasEqualSum(1,-1,0); should return true since  1 +(-1) is equal to 0
     */

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,1));  // false
        System.out.println(hasEqualSum(1,1,2));  // true
        System.out.println(hasEqualSum(1,-1,0)); // true

    }

    public static boolean hasEqualSum(int first, int second, int third) {

        if (first + second == third)
            return true;
        else
            return false;
    }
}
