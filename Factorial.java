import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num;
        while (true) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break;
            } else {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
        // The maximum factorial that can be stored in a long data type is 20
        if (num > 20) {
            System.out.println("Factorial overflows the range of long data type.");
            return;
        } else if (num < 0) {
            System.out.println("The factorial of a negative number is undefined.");
            return;
        }
        System.out.print("""
                By which of the following method do you want to find factorial?
                1. Iteration Method
                2. Recursion Method
                Enter your choice(1 or 2): 
                """);
        int choice;
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice == 1 || choice == 2) break;
                else {
                    System.out.println("Enter 1 or 2 only.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
        if (choice == 1) {
            long res = factorialIterative(num);
            System.out.printf("""
                    The factorial of number %d by iteration method is %d
                    """, num, res);
        } else if (choice == 2) {
            long res = factorialRecursive(num);
            System.out.printf("""
                    The factorial of number %d by recursion method is %d
                    """, num, res);
        }

        sc.close();
    }

    public static long factorialIterative(long num) {
        if (num < 2) return 1;
        long res = 1;
        for (long i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static long factorialRecursive(long num) {
        if (num < 2) return 1;
        return num * factorialRecursive(num - 1);
    }
}
