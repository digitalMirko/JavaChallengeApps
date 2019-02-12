package app11_playing_cat;

public class PlayingCat {

    /*  Challenge: Playing Cat
        The cats spend most of the day playing. In particular, they play if the
            temperature is between 25 and 35 (inclusive). Unless its summer, then
            the upper limit is 45(inclusive) instead 35.
        Write a method isCatPlaying that has 2 parameters. Method needs to return true
            if cat is playing, otherwise return false.
        1st parameter should be of type boolean and be named summer it represents if it
            is summer. 2nd parameter represents the temperature and is of type int with
            the name temperature.
        Examples of Input/Output:
        - isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
        - isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35
            (summer parameter is false)
        - isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
     */

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));  // false
        System.out.println(isCatPlaying(false,36)); // false
        System.out.println(isCatPlaying(false,35)); // true
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((summer == true) && ((temperature >= 25) && (temperature <= 45))){
            return true;
        } else if ((summer != true) && ((temperature >= 25) && (temperature <= 35))){
            return true;
        } else {
            return false;
        }
    }
}
