import java.util.Scanner;
public class diamondPatternAppproch2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius of diamond: ");
        int n = sc.nextInt();
        int colDist = 0, rowDist = 0, center = n -1;
        for (int i = 0; i < 2*n - 1; i++){
            for(int j = 0; j < 2*n - 1; j++){
                colDist = Math.abs(j - center);
                rowDist = Math.abs(i - center);
                if(colDist + rowDist == n - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
