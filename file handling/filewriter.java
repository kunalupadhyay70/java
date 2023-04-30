import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args)throws IOException {
        FileWriter fw =new FileWriter("c:\\coding.java.file handling.folder.file.txt",true);
        fw.write("java");
        fw.write(23); // uss file mai iss ki character value likhi jayegi prabhu
          char c[]= {'f','e','w'};
          fw.write(c);
          fw.close();// closing the open resouce of the input 
          fw.flush();// flushing the data which is in the buffer waiting for the more data
    }
}
