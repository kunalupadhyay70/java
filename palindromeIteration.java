import java.io.IOException;
class palindromeIteration {
    public static void main(String...args)throws IOException ,InterruptedException {
   
    // new ProcessBuilder("cls","cmd","/c").inheritIO().start().waitFor();
    String s= "madam";
    String s2="";
    for (int i=s.length()-1;i>=0;i--){
        s2+=s.charAt(i);
    }
if (s.equals(s2))
System.out.println("ha hai palindrome");
else
System.out.println("nhi hai palindrome");
    }
}