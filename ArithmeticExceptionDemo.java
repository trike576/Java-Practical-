class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Error: Provide two integers.");
                return;
            }

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer input.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
