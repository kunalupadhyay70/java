import java.util.*;  
import java.util.Scanner;
import javax.xml.transform.Source;
public class ScannerHasNextExample1 {    
    public static void main(String args[]){       
          //Create Scanner object  
        Scanner scan = new Scanner(System.in).useDelimiter("fish");
        String a;
        if (scan.hasNext()){
          a=scan.nextLine();
        }
        else 
         a="null";
         scan.tokens();
        // Printing the delimiter used  
        scan.tokens();
        // Print the Strings  
       while (scan.hasNext())
            System.out.println(scan.next());  
       
        //Close the scanner  
        scan.close();  
        }    
}  