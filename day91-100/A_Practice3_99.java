
// Q4. Write a java program to generate a multiplication table of a 
// given number and write it to a file.

import java.io.FileWriter;
import java.io.IOException;

public class A_Practice3_99 {
    public static void main(String[] args) {
        int i = 19; 
        String table = "";
        for(int j=0; j<10; j++){
            table += i+"X"+(j+1)+"="+i*(j+1);
            table += "\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
