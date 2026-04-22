import java.util.Scanner;

public class diamondPatternWithSpaces {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Variables
        System.out.print("Enter number of rows you want: ");
        int noOfRows = scanner.nextInt();
        int noOfSpaces = noOfRows / 2 + 1;
        int noOfPlus = 1;
        int currentRow = 0;
        String plus = "+ ";
        String space = " ";
        // Upper Half
        while ( currentRow <= noOfRows / 2 ){
            System.out.print(space.repeat(noOfSpaces));
            System.out.println(plus.repeat(noOfPlus));
            noOfPlus ++;
            currentRow ++;
            noOfSpaces --;
        }

        // Variables Reset
        currentRow = 0;
        noOfSpaces += 2;
        noOfPlus -= 2;
        // Lower Half
        while (currentRow <= noOfRows / 2 - 1){
            System.out.print(space.repeat(noOfSpaces));
            System.out.println(plus.repeat(noOfPlus));
            noOfPlus --;
            noOfSpaces ++;
            currentRow ++;
        }
    }
}
