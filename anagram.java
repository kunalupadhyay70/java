import java.lang.reflect.Array;
import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter the strings");
    String s1=scan.nextLine();
    String s2= scan.nextLine();
    s1= s1.replace(" ","");//rmove the whitespaces 
    s2=s2.replace(" ","");
    // convert the character in lower case 
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    // convert the string into the array
    char arr1[]= s1.toCharArray();
    char arr2[]=s2.toCharArray();
    //sort the arrays
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    //check the arrays equality 
    if (Arrays.equals(arr1,arr2))
     System.out.println("it is an anagram ");
     else 
     System.out.println("it is not the annagram ");
    }

}
