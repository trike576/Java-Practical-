import java.util.Scanner;

class PlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        printPlusPattern(size);
    }

    static void printPlusPattern(int size) {
        int midRowForOddSize = size / 2, midRow1ForEvenSize = size / 2, midRow2ForEvenSize = size / 2 + 1;
        int noOfStars = 1;
        int noOfSpacesForEvenSize = ((size * 2) - 3) / 2;
        int noOfSpacesForOddSize = ((size * 2) - 2) / 2;

        if (size % 2 == 0) {
            for (int i = 0; i < midRow1ForEvenSize; i++) {
                if (noOfSpacesForEvenSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForEvenSize));
                System.out.print("*".repeat(noOfStars));
                System.out.print(" ".repeat(noOfSpacesForEvenSize));
                noOfSpacesForEvenSize -= 2;
                noOfStars += 4;
                System.out.println();
            }
            noOfStars -= 4;
            noOfSpacesForEvenSize = 0;
            for(int i = midRow1ForEvenSize; i < size; i++){
                if(noOfSpacesForEvenSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForEvenSize));
                System.out.print("*".repeat(noOfStars));
                if (noOfSpacesForEvenSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForEvenSize));
                System.out.println();
                noOfSpacesForEvenSize += 2;
                noOfStars -= 4;
            }
        }
        else{
            for(int i = 0; i < midRowForOddSize; i++){
                if(noOfSpacesForOddSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForOddSize));
                System.out.print("*".repeat(noOfStars));
                if(noOfSpacesForOddSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForOddSize));
                System.out.println();
                noOfSpacesForOddSize -= 2;
                noOfStars += 4;
            }
            noOfStars = ((size + 1) * 2) - 3;
            noOfSpacesForOddSize = 0;
            for(int i = midRowForOddSize; i < size; i++){
                if(noOfSpacesForOddSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForOddSize));
                System.out.print("*".repeat(noOfStars));
                if(noOfSpacesForOddSize > 0)
                    System.out.print(" ".repeat(noOfSpacesForOddSize));
                System.out.println();
                noOfSpacesForOddSize += 2;
                noOfStars -= 4;
            }
        }
    }
}