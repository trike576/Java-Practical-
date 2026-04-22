import java.util.Scanner;

public class crossPattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a odd size:");
        int size = scanner.nextInt();
        if(size %2 == 0){
            System.out.println("The entered value %d is not odd. Please enter an odd size.");
            return;
        }
        printPattern(size);
    }
    public static void printPattern(int size){
        String space = " ", X = "X";
        int noOfInitialSpaces = 0, noOfMiddleSpaces = size-2;

        // For loop for upper triangle
        for(int i = 0; i <= size / 2; i++){
            // Ensuring noOfMiddleSpaces don't go below zero
            if(noOfMiddleSpaces < 0){
                noOfMiddleSpaces = 0;
            }
            // First X
            System.out.print(space.repeat(noOfInitialSpaces));
            System.out.print(X.repeat(1));

            // Second X
            System.out.print(space.repeat(noOfMiddleSpaces));
            // Check for middle row
            if (i != size/2){
                System.out.print(X.repeat(1));
            }
            System.out.println();

            // Updation
            noOfInitialSpaces++;
            noOfMiddleSpaces -= 2;
        }

        // Updation of variables for lower remaining portion of triangle
        noOfInitialSpaces -= 2;
        noOfMiddleSpaces += 3;

        // For loop for lower remaining portion of triangle
        for(int i = 0; i < size / 2; i++){
            // Ensuring noOfMiddleSpaces don't go below zero
            if(noOfMiddleSpaces < 0){
                noOfMiddleSpaces = 0;
            }
            // First X
            System.out.print(space.repeat(noOfInitialSpaces));
            System.out.print(X.repeat(1));

            System.out.print(space.repeat(noOfMiddleSpaces));

            // Second X
            System.out.println(X.repeat(1));

            // Updation of variables
            noOfInitialSpaces--;
            noOfMiddleSpaces += 2;
        }
    }
}
