class countingCharacterOccurenceByLoop {
    public static int countUsingLoop(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Error: Please provide exactly 2 arguments.");
                return;
            }

            if (args.length > 2) {
                System.out.println("Warning: Extra arguments detected. Skipping excess inputs.");
            }

            if (args[0].length() != 1) {
                System.out.println("Error: First argument must be a single character.");
                return;
            }

            char ch = args[0].charAt(0);
            String str = args[1];

            int count = countUsingLoop(ch, str);
            System.out.println("Count: " + count);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
