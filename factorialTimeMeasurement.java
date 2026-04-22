public class factorialTimeMeasurement {
    public static void main(String[] args){
        int num = 20;
        int runs = 100000;

        long startIter = System.nanoTime();
        long dummy1 = 0;
        for (int i = 0; i < runs; i++) {
            dummy1 ^= iterativeFactorial(num);
        }
        long endIter = System.nanoTime();
        long startRec = System.nanoTime();
        long dummy2 = 0;
        for (int i = 0; i < runs; i++) {
            dummy2 ^= recursiveFactorial(num);
        }
        long endRec = System.nanoTime();
        long iterativeTime = (endIter - startIter) / runs;
        long recursiveTime = (endRec - startRec) / runs;
        System.out.println("Average time for factorial of " + num +
                " by iterative and recursive methods respectively is " +
                iterativeTime + " ns and " + recursiveTime + " ns");


        num = 0;
        runs = 100000;
        startIter = System.nanoTime();
        dummy1 = 0;
        for (int i = 0; i < runs; i++) {
            dummy1 ^= iterativeFactorial(num);
        }
        endIter = System.nanoTime();
        startRec = System.nanoTime();
        dummy2 = 0;
        for (int i = 0; i < runs; i++) {
            dummy2 ^= recursiveFactorial(num);
        }
        endRec = System.nanoTime();
        iterativeTime = (endIter - startIter) / runs;
        recursiveTime = (endRec - startRec) / runs;
        System.out.println("Average time for factorial of " + num +
                " by iterative and recursive methods respectively is " +
                iterativeTime + " ns and " + recursiveTime + " ns");

        num = -12;
        runs = 100000;
        startIter = System.nanoTime();
        dummy1 = 0;
        for (int i = 0; i < runs; i++) {
            dummy1 ^= iterativeFactorial(num);
        }
        endIter = System.nanoTime();
        startRec = System.nanoTime();
        dummy2 = 0;
        for (int i = 0; i < runs; i++) {
            dummy2 ^= recursiveFactorial(num);
        }
        endRec = System.nanoTime();
        iterativeTime = (endIter - startIter) / runs;
        recursiveTime = (endRec - startRec) / runs;
        System.out.println("Average time for factorial of " + num +
                " by iterative and recursive methods respectively is " +
                iterativeTime + " ns and " + recursiveTime + " ns");
        num = -12;
    }
    public static long iterativeFactorial(int n){
        if(n < 0) return -1;
        if(n == 0 || n == 1) return 1;

        long fact = 1;
        for(int i = 2; i <= n; i++){
            if(fact > Long.MAX_VALUE / i) return 0;
            fact *= i;
        }
        return fact;
    }
    public static long recursiveFactorial(int n){
        if(n < 0) return -1;
        if(n == 0 || n == 1) return 1;

        long temp = recursiveFactorial(n - 1);
        if(temp == -1 || temp > Long.MAX_VALUE / n) return 0;

        return n * temp;
    }
}
