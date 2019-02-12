package app12_day_of_the_week;

public class DayOfTheWeek {
     /*  Challenge: Day of the Week
        * Write a method with the name printDayOfTheWeek that has one parameter
            of type int and name it day.

        * The method should not return any value(hint: void)

        * Using a switch statement print "Sunday,"Monday",..."Saturday" if the int
            parameter "day" is 0, 1,...6 respectively, otherwise it should print "Invalid day".

        Bonus:
        * Write a second solution using if then else, instead of switch.

     */

    public static void main(String[] args) {

        printDayOfTheWeek(-1); // Invalid day
        printDayOfTheWeek(0);  // Sunday
        printDayOfTheWeek(1);  // Monday
        printDayOfTheWeek(2);  // Tuesday
        printDayOfTheWeek(3);  // Wednesday
        printDayOfTheWeek(4);  // Thursday
        printDayOfTheWeek(5);  // Friday
        printDayOfTheWeek(6);  // Saturday
        printDayOfTheWeek(7);  // Invalid day

        System.out.println("------------------------------");

        printDayViaIf(-1); // Invalid day
        printDayViaIf(0);  // Sunday
        printDayViaIf(1);  // Monday
        printDayViaIf(2);  // Tuesday
        printDayViaIf(3);  // Wednesday
        printDayViaIf(4);  // Thursday
        printDayViaIf(5);  // Friday
        printDayViaIf(6);  // Saturday
        printDayViaIf(7);  // Invalid day
    }

    public static void printDayOfTheWeek(int day){
        // switch statement version
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayViaIf(int day) {
        // if statement version
        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
