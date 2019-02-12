package app08_area_calculator;

public class AreaCalculator {

    /*  Challenge: Area Calculator
        Write a method named area with one double parameter named radius
        The method needs to return a double value that represents the area
            of a circle
        If the parameter radius is negative then return -1.0 to represent
            an invalid value
        Write another overloaded method with 2 parameters x and y (both
            doubles), where x and y represent the sides of a rectangle
        The method needs to return an area of a rectangle
        If either or both parameters is/are negative return -1.0 to
            indicate an invalid value
        For formulas and PI value please check the tips below

        Examples of input/output:
        - area(5.0); should return 78.53975
        - area(-1); should return -1 since the parameter is negative
        - area(5.0, 4.0); should return 20.0 (5*4 = 20)
        - area(-1.0, 4.0); should return -1 since the first parameter is negative
        - area(0,0); should return 0.0

        Tip: Formula for calculating a circle area is radius * radius * PI.
            for PI user number 3.14159
        Tip: Formula for calculating a rectangle area is x * y
        Note: The area methods needs to be defined as public static.
     */

    public static final double PI = 3.14159d;

    public static void main(String[] args) {
        System.out.println(area(5.0));          // 78.53975
        System.out.println(area(-1));           // -1.0
        System.out.println(area(5.0,4.0));      // 20.0
        System.out.println(area(-1.0, 4.0));    // -1.0
        System.out.println(area(0.0,0.0));      // 0.0
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        double areaOfCircle = radius * radius * PI;
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)){
            return -1.0d;
        }
        double rectangle = x * y;
        return rectangle;
    }
}
