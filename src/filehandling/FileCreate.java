package filehandling;

import java.io.File;

public class FileCreate {
    public static void main(String[] args) {

          File myobj = new File("/Users/akashghosh/Documents/Java/FileHandling/src/filehandling/file.txt");
    if (myobj.exists()) {
        System.out.println(myobj.getAbsolutePath());
        System.out.println(myobj.length());
        System.out.println(myobj.canRead());


    }else {
        System.out.println("file not exists");
    }

    }

}
