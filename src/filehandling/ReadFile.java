package filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myobj = new File("/Users/akashghosh/Documents/Java/FileHandling/src/filehandling/file.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (Exception e){
            System.out.println("Error occured");
        }
    }
}
