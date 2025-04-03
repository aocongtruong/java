package bai2;
import java.io.*;

public class KeyboardToFile {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "D:\\week4\\src\\bai2\\output.txt"; 

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
 
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine(); // Move to the next line
            }

            System.out.println("Data has been written to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

