import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args)throws IOException {
        File f1= new File("file handling", "folder");
        try {
            f1.mkdir();
 
        } catch (Exception e) {
            System.out.println("file doesnt exist "+e);
        }
   File f2 = new File(f1,"file.txt");
        System.out.println(f1.exists());
      System.out.println("if papu exist in the folder kukda----->"+f2.isFile());
        f2.createNewFile();
        System.out.println("if papu exist in the folder kukda----->"+f2.isFile());
        System.out.println(f1.getPath());


        
    }
}
