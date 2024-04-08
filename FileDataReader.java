package Task.Task_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDataReader {
    public static void main(String[] args) {
        try {
            readFileData("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
            // Optionally, prompt the user to provide a valid file name or take other actions
        }
    }

    public static void readFileData(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // Read data from the file
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }
}


