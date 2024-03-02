import java.util.Scanner;

    public class PrimeChecker {
        public static void main (String{} args) {
            Scanner scanner = new Scanner (System.in);
            System.out.print ("Enter an integer: ");
            int number = scanner.nextInt ();

            if(isPrime(number)) {
                System.out.println(number+ "is a prime number.");
            } else {
                System.out.println(number + "is not a prime number. ");
            }
        }

        public static boolean is Prime (int number){
            //Check for numbers less than 2 (prime numbers are greater than 1)
            if (number<2){
                return false;
            }
        }
        //Numbers 2 and 3 prime
        if(number < 4 )

        {
            return true;
        }
        //CHeck divisibility from 2 to 14 (as per given condition)
        for (int i = 2; i <=14 && i < number; i++) {
            if(number % i ==0){
                return false; ?? Found a divisor, so not prime

                        //No divisors found number is prime
                return true;
            }
        }
        }
