// there are two types of the string mutable ,immutable 
import java.io.IOException;
class stringTypes{
    public static void main( String...args)throws IOException,InterruptedException
   {new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
    String brand ="kunal";//immutable string 
    System.out.println(brand);
    brand.concat(" expert");//cant change the original string 
    System.out.println(brand);
    StringBuilder brand1= new StringBuilder("kunal"); //mutable 
    System.out.println(brand1);
    brand1.append(" expert"); //the changes will reflect in the object
    System.out.println(brand1);
}}