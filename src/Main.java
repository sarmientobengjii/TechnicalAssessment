import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        isPrime(number);
        factorial(number);
    }

    public static void isPrime(int number) {

        if (number < 2) {
            System.out.println("Invalid number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++ ) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else  {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void factorial(int number) {

        int result = 1;

        if (number >= 20) {
            System.out.println("INTEGER OVERFLOW! INTEGER OVERFLOW!");
            return;
        }

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        while (number > 1) {
            result = result * number;
            number--;
        }
        System.out.println("Factorial result: " + result);
    }
}