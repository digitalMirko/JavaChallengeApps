package app15_calculate_interest;

public class ForStatementChallenge {

    /*  Challenge: Part 1, Calculate Interest
        Using the for statement, call the calculateInterest method with
        the amount of $10,000 with an interestRate of 2,3,4,5,6,7 and 8
        and print the results to the console window.

        Challenge: Part 2, Calculate Interest
        How would you modify the for loop to do the same thing as shown
        but to start from 8% and work back to 2%
     */

    public static void main(String[] args) {
        // Challenge Part 1
        for(int i = 2; i <= 8; i++){
            System.out.println("$10,000 at " + i + "% interest = $" +
                    String.format("%.2f",calculateInterest(10000,i)));
            /* Output:
                $10,000 at 2% interest = $200.00
                $10,000 at 3% interest = $300.00
                $10,000 at 4% interest = $400.00
                $10,000 at 5% interest = $500.00
                $10,000 at 6% interest = $600.00
                $10,000 at 7% interest = $700.00
                $10,000 at 8% interest = $800.00
             */
        }

        // symbol break between for statements
        System.out.println("********************************");

        for(int i = 8; i > 1; i--){
            System.out.println("$10,000 at " + i + "% interest = $" +
                    String.format("%.2f",calculateInterest(10000,i)));
            /* Output:
                $10,000 at 8% interest = $800.00
                $10,000 at 7% interest = $700.00
                $10,000 at 6% interest = $600.00
                $10,000 at 5% interest = $500.00
                $10,000 at 4% interest = $400.00
                $10,000 at 3% interest = $300.00
                $10,000 at 2% interest = $200.00
             */
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}
