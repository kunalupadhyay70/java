public class ExceptionFirst {
public static void main(String[] args) {
    int n1=10;
    int n2=5; 
    n2=0;
    
 int result =0;
 try {
    result= n1/n2; //no exception but if n2 is 0 the exception occur
 }
catch (Exception e) {
   System.out.println("the denominater can not be 0");
    System.out.println(e);
 }
 System.out.println(result);
 System.out.println("bye");
}
    
}