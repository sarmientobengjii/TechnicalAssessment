import java.util.Scanner;

public class TechnicalAssessment {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        getPrimeResult(number);
        getFactorialResult(number);
    }

    public static String getPrimeResult(int number) {

        if (number < 2) {
            return number + " is not a prime number";
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
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

        int result = 1;

        if (number > 12) {
            return "INTEGER OVERFLOW!";

        }
        if (number < 0) {
            return "Factorial not defined by negative number";
        }

        while (number > 1) {
            result = result * number;
            number--;
        }

        return "Factorial result: " + result;
    }
}
