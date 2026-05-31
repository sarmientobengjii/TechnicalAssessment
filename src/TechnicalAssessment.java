import java.util.Scanner;

public class TechnicalAssessment {
    public static void main (String[] args) {

        //SCANNER FOR INPUT/OUTPUT IN CONSOLE
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        //METHOD CALLS TO ACCESS PRINT-RESULT & FACTORIAL-RESULT FUNCTIONALITIES FROM BACKEND TO FRONTEND(GUI)
        getPrimeResult(number);
        getFactorialResult(number);
    }

    public static String getPrimeResult(int number) {

        /*
            Prime = A GIVEN NUMBER GREATER THAN ONE(1) THAT CAN ONLY BE DIVIDED EVENLY BY 1 AND ITSELF
                EXAMPLE: IF THE GIVEN NUMBER CAN BE DIVIDED EVENLY, THE IT'S NOT PRIME
            Not Prime = A GIVEN NUMBER GREATER THAN ONE(1) THAT CAN BE DIVIDED EVENLY
                BY NUMBERS OTHER THAN ONE(1) AND ITSELF.
                EXAMPLE: NUMBER % i == 0 MEANS NOT PRIME BECAUSE THERE'S NO REMAINDER.
        */

        if (number < 2) {
            return number + " is not a prime number";
        }

        boolean isPrime = true;

        // Instead of (int i = 2; i < number; i++), I used Math.sqrt() for a more optimized and faster loop execution.
        // Instead of looping through the entire number, the loop only checks
        // possible divisors up to the square root of the given number.

        for (int i = 2; i <= Math.sqrt(number); i++) {

            /*
            * boolean isPrime = true; sets the default condition prime logic as "TRUE"
            * int i = 2 = we setup i = 2 as our default starting point because 1 is not considered a prime number,
                and the condition stays true because every number is divisible by one(1).
            * i < number; i++ means if we are checking if 5 is prime number, start the loop from (i = 2), then 3, then 4,
            *   until 5.
            *   NOTE: LOOPS STOPS(break;) if the condition fails(if the loop found a divisor between 2, 3, & 4.
            */

            if (number % i == 0) {
                isPrime = false; // if condition found another divisor, this immediately breaks loop. = NOT PRIME
                break;
            }
        }

        if (isPrime) {
            return number + " is a prime number";
        } else {
            return number + " is not a prime number";
        }
    }

    public static String getFactorialResult(int number) {

        /*
        *   Factorial is basically multiplying the given number by its decreasing value until 1.
        *   EXAMPLE: 5 * 4 * 3 * 2 * 1 = FACTORIAL RESULT
        *
        *   NOTE: You can't find the factorial of a negative(-) number based on mathematical rule/standard.
        */

        int result = 1;
        // int result = 1; anything multiplied by stays the same; e.g., 1 * 5 = 5(RESULT)

        if (number > 12) {
            return "INTEGER OVERFLOW!";
            /* INTEGER OVERFLOW means a certain data type can only store limited value
               int, long, and BigIntegers comes in
             */
        }
        if (number < 0) {
            return "Factorial not defined by negative number";
            // Negative(-) number is invalid in mathematical rules/standards.
        }

        while (number > 1) {
            result = result * number;
            number--;
            /*
            FOR SIMPLE MATH:
            GIVEN NUMBER = 5
            RESULT = 1

            RESULT = 1 * NUMBER(5) = 5
            RESULT = 5 * NUMBER(4) = 20
            RESULT = 20 * NUMBER(3) = 60
            RESULT = 60 * NUMBER(2) = 120
            RESULT = 120 * NUMBER(1) = 120

            FACTORIAL RESULT = 120
             */
        }

        return "Factorial result: " + result;
    }
}
