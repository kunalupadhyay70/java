//reverse the string 
import java.io.IOException;
import java.util.Scanner;  
class ReverseString
{  
public static void main(String... arg) throws IOException, InterruptedException   
{  
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
//case 1 if the string is kunal then output is "lanuk"
{ Scanner scan=new Scanner(System.in);
System.out.println("enter the string to get reverse of it");
String s=scan.nextLine(); 
String res="";
 for (int i=s.length()-1;i>=0;i--) //traversing the strig from last tp first character
 {
res+=s.charAt(i);
 }
 System.out.print("the reversed string is :-> "+ res + "\n"); }
//case 2 string= kuna upadhyay, output = upadhyay kuanl
{
System.out.println("\n pattern 2 reverse\n");
 Scanner scan=new Scanner(System.in);
System.out.println("enter the string to get reverse of it");
String s=scan.nextLine();
String res="";
String sArr[]=s.split(" ");//split function return the string
for( int i=sArr.length-1;i>=0;i--){
    res=res+sArr[i]+" ";
}
System.out.println("the reversed is = "+res);
}   
//case 3: s=kunal ji , output = lanuk ij
{
System.out.println("\n pattern 3 reverse\n");
 Scanner scan=new Scanner(System.in);
System.out.println("enter the string to get reverse of it");
String s=scan.nextLine();
String res="";
String sArr[]=s.split(" ");//split function return the string
for ( String element:sArr)//advance for lopp to get each word fro the string
{
    for (int i=element.length()-1; i>=0;i--)
    {
        res+=element.charAt(i);
    } res+= " ";
}
System.out.println("reversed is= "+res);
}
}}