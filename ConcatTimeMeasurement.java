import java.util.Scanner;
class ConcatTimeMeasurement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of runs you want to perform concatenation: ");
        long runs = sc.nextInt();
        sc.nextLine();

        // String time measurement
        String s = "";
        long stringTime1 = System.nanoTime();
        for(int i = 0; i < runs; i++){
            s = s.concat("Haha");
        }
        long stringTime2  = System.nanoTime();
        // String time
        long stringTime = stringTime2 - stringTime1;

        // StringBuffer time measurement
        StringBuffer sbf = new StringBuffer("");
        long stringBufferTime1 = System.nanoTime();
        for (int i = 0; i < runs; i++){
            sbf.append("Haha");
        }
        long stringBufferTime2 = System.nanoTime();
        // StringBuffer time
        long stringBufferTime = stringBufferTime2 - stringBufferTime1;

        // StringBuilder time measurement
        StringBuilder sb = new StringBuilder("");
        long stringBuilderTime1 = System.nanoTime();
        for(int i = 0; i < runs; i++){
            sb.append("Haha");
        }
        long stringBuilderTime2 = System.nanoTime();
        // StringBuilder time
        long stringBuilderTime = stringBuilderTime2 - stringBuilderTime1;

        System.out.println("The time required by String, StringBuffer and StringBuilder is " + stringTime + "ns " + stringBufferTime + "ns " + stringBuilderTime + "ns respectively");
        sc.close();
    }
}
