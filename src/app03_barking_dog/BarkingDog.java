package app03_barking_dog;

public class BarkingDog {

    /*  Challenge: Barking Dog
        We have a dog that likes to bark. We need to wake up if the dog is barking at night!

        Write a method bark that has 2 parameters

        1st parameter should be of type boolean and named barking it represents
        if our dog is currently barking.

        2nd parameter represents the hour of the day and is of type int with
        name hourOfDay and has valid range of 0-23

        We have to wake up if the dog is barking before 08:00 am or after 22:00 hours
        so in that case return true.

        In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false

        Examples of input/output:
        - bark(true, 1); should return true
        - bark(false, 2); should return false, since the dog is not barking
        - bark(true, 8); should return false, since its not before 8:00 AM
        - bark(true, -1); should return false because the hourOfDay  parameter needs to be in range 0-23

        Tip: Use an if else statement with multiple conditions
     */

    public static void main(String[] args) {

        System.out.println(bark(true, 1));  // true
        System.out.println(bark(false, 2)); // false
        System.out.println(bark(true, 8));  // false
        System.out.println(bark(true, -1)); // false
    }

    public static boolean bark(boolean barking, int hourOfDay){
        // hourOfDay range: 0-23
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        if ((barking) && ((hourOfDay < 8 || hourOfDay > 22))) {
            return true;
        } else if (!barking) {
            return  false;
        } else if (barking && hourOfDay < 8 ){
            return false;
        } else if (!barking && hourOfDay < 0 ){
            return false;
        }
        return false;
    }
}
