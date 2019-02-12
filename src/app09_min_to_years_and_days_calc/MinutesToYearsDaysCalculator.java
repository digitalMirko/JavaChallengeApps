package app09_min_to_years_and_days_calc;

public class MinutesToYearsDaysCalculator {

    /*  Challenge: Create a Minutes To Years and Days Calculator
        Write a method printYearsAndDays with parameter of type long named minutes.
        The method should not return anything (void) and it needs to calculate the
            years and days from the minutes parameter.
        If parameter is less than 0, print text "Invalid Value"
        Otherwise if parameter is valid then it needs to print a message in the format
            "XX min = YY y and ZZd".
        XX represents the original value minutes YY represents the calculated years.
            ZZ represents calculated days.

        Examples of Input/Output:
        - printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
        - printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
        - printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
     */

    public static void main(String[] args) {
        printYearsAndDays(525600);   // 525600 min = 1 y and 0 d
        printYearsAndDays(-525600);  // Invalid Value
        printYearsAndDays(1051200);  // 1051200 min = 2 y and 0 d
        printYearsAndDays(581760);   // 581760 min = 1 y and 39 d

    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / (365 * 24 * 60);
            long remainingDays = (minutes / (24*60)) % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
