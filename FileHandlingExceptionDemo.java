import java.io.*;

class FileHandlingExceptionDemo {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            if (args.length < 1) {
                System.out.println("Error: Provide file name.");
                return;
            }

            fr = new FileReader(args[0]);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem reading file.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error: Failed to close file.");
            }
            System.out.println("Execution completed.");
        }
    }
}
