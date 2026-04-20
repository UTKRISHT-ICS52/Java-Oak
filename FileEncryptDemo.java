import java.io.*;
import java.util.Scanner;

public class FileEncryptDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            // Outer try → file reading
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line, content = "";

            while ((line = br.readLine()) != null) {
                content += line + "\n";
            }
            br.close();

            // Inner try → encryption logic
            try {
                String encrypted = "";

                for (int i = 0; i < content.length(); i++) {
                    char ch = content.charAt(i);
                    encrypted += (char)(ch + 2); // simple encryption (shift +2)
                }

                // Nested try → writing file
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter("encrypted_" + fileName)
                    );

                    bw.write(encrypted);
                    bw.close();

                    System.out.println("File encrypted successfully!");
                } catch (IOException e) {
                    System.out.println("Error writing file: " + e.getMessage());
                }

            } catch (Exception e) {
                System.out.println("Encryption error: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

        sc.close();
    }
}
