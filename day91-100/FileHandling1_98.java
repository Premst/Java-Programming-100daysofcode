
// day-98 100daysofcodechallenge
// File handling in Java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling1_98 {
    public static void main(String[] args) {
        // 1. Creating a new file:
        File myFile = new File("Create_prem_file.txt");
        try{
           myFile.createNewFile(); 
           System.out.println("File created successfully.");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        // 2. Writing to a file:
        try{
            FileWriter fileWriter = new FileWriter("Create_prem_file.txt");
            fileWriter.write("FileWriter class is used its write() method to write some content in a file.");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // 3. Reading a file:
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        // 4. Deleting a file:
        // if(myFile.delete()){
        //     System.out.println("I have deleted : "+myFile.getName());
        // }
        // else{
        //     System.out.println("Some problem occured while deleting the file");
        // }
    }
}
