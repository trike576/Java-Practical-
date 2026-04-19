class ArrayIndexExceptionDemo {

    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30, 40, 50};

            if (args.length < 1) {
                System.out.println("Error: Provide an index.");
                return;
            }

            int index = Integer.parseInt(args[0]);

            System.out.println("Element: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid index input.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
