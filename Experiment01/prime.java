// Problem 2:
// Implement a Java program to check whether a given number is prime or not.
// (Take the number as a command-line argument.)

public class PrimeCheck {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}