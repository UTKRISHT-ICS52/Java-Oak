/* write a data in to a file
import java.io.*; 
class writeFile{
    public static void main(String[] args) {
        try 
        {
            FileWriter f = new FileWriter("C:\\Users\\utkri\\OneDrive\\Documents\\Custom Office Templates\\OneDrive\\Desktop\\Java Core\\myfile.txt");
            try {
            f.write("Java is a class based , high level Object oriented programming language! ");
            }
            finally {
                f.close();
            }
            System.out.println("Successfully written to the file.");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}
*/



