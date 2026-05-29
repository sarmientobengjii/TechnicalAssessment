import java.util.Scanner;

public class TechnicalAssessment {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        isNumberPrime(number);
        factorial(number);
    }

    public static void isNumberPrime(int number) {

        if (number < 2) {
            System.out.println("Invalid number");
            return;
        }

        boolean isNumberPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isNumberPrime = false;
                break;
            }
        }

        if (isNumberPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void factorial(int number) {

        int result = 1;

        if (number > 12) {
            System.out.println("integer overflow!");
            return;
        }
        if (number < 0) {
            System.out.println("Factorial not defined by negative number");
            return;
        }

        while (number > 1) {
            result = result * number;
            number--;
        }
        System.out.println("Factorial result: " + result);
    }
}
