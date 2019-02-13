package app16_is_prime_number;

public class IsPrimeNumber {
      /* Challenger: Determine if a number is prime
         Create a for statement using any range of numbers
         Determine if the number, is a prime number using the isPrime method
         If it is a prime number, print it out AND increment a count of the
         number of prime numbers found.
         If that count is 3, exit the for loop
     */

    public static void main(String[] args) {
        int count = 0;
        for(int i = 23; i < 100; i++){
            if (isPrime(i) == true) {
                count++;
                System.out.println(i + " is a prime number");
                if(count == 3){
                    break;
                }
            }
        }
    }

    // is a number a prime number
    public static boolean isPrime(int n ){
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
