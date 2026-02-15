import java.util.Scanner;
public class diamondPatternApproach1 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius of diamond: ");
        int n = sc.nextInt();
        int noOfInitialSpaces = n - 1, noOfMiddleSpaces = -1;
        String space = " ";
        for(int i = 0; i <= (2*n - 1) / 2; i++){
            System.out.print(space.repeat(noOfInitialSpaces));
            System.out.print("*");
            if(i != 0){
                System.out.print(space.repeat(noOfMiddleSpaces));
                System.out.print("*");
            }
            System.out.println();
            noOfInitialSpaces--;
            noOfMiddleSpaces += 2;
        }
        noOfInitialSpaces = 1;
        noOfMiddleSpaces -= 4;
        for(int i = 0; i < n - 1; i++){
            System.out.print(space.repeat(noOfInitialSpaces));
            System.out.print("*");
            if(noOfMiddleSpaces >= 1){
                System.out.print(space.repeat(noOfMiddleSpaces));
                System.out.print("*");
            }
            System.out.println();
            noOfInitialSpaces++;
            noOfMiddleSpaces -= 2;
        }
    }
}
