import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * CODTECH Internship - File Handling Utility
 * Deliverable: A script demonstrating Read, Write, and Modify operations.
 */
public class FileUtility {

    public static void main(String[] args) {
        // Define the file path
        Path filePath = Paths.get("codtech_internship.txt");

        try {
            // 1. WRITE: Create and write initial data to the file
            String initialContent = "Task: File Handling Utility\nStatus: Initialized\n";
            Files.write(filePath, initialContent.getBytes());
            System.out.println("SUCCESS: File created and initial data written.");

            // 2. MODIFY (APPEND): Add new data without overwriting existing content
            String updateContent = "Update: Modify operation successful.\n";
            Files.write(filePath, updateContent.getBytes(), StandardOpenOption.APPEND);
            System.out.println("SUCCESS: File modified (data appended).");

            // 3. READ: Retrieve data from the file and display it
            System.out.println("\n--- Reading File Content ---");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("----------------------------");

        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }
}