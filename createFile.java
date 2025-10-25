/* File Handling (Create a file) in Java 
import java.io.*;

class createFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\utkri\\OneDrive\\Documents\\Custom Office Templates\\OneDrive\\Desktop\\Java Core\\myfile.txt");
        if(f.createNewFile())
        {
            System.out.println("File Succesfully created: ");
        }
        else
        {
            System.out.println("File already exists.");
        }
    }
}
*/