package latihansoal1;
import java.io.*;
public class checked {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\test\test.txt");
            BufferedReader fileInput = new BufferedReader(file);
            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++) 
                System.out.println(fileInput.readLine());
            fileInput.close();  
        }
        catch(FileNotFoundException ex) {
            System.out.println("Ini adalah Checked condition");
            System.out.println("Error fileNotException");
        }
        catch(IOException e) {
            System.out.println("Ini adalah Checked condition");
            System.out.println("Error IOException");
        }
    }
}
