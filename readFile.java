/* Read data from a File */
import java.io.*;
class readFile {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\utkri\\OneDrive\\Documents\\Custom Office Templates\\OneDrive\\Desktop\\Java Core\\myfile.txt");
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Handling exception: " + e);
        }
    }
} 
