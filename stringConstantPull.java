// string constant pull or using the string declaration 
 // immutable string  or memory map
 import java.io.IOException;
 class stringConstantPull{
    public static void main (String...arg)throws IOException,InterruptedException
    {
       new ProcessBuilder("cls","/c","cmd").inheritIO().start().waitFor();
        String s1="pw";//stored in string constant pull area of heap ,doesnt allow to duplicate the string 
        String s2="pw";//thats why s1 and s2 get the same address of the object that is in scp of the heap area || of memory 
        String p1=new String("pw");//stored in heap allows the duplicate of the string 
        String p2=new String("pw");
        System.out.println(s1==s2);//return the true because bothe refernce has the same address 
        System.out.println(p1==p2); //doesnt have the same value p1 and p2 have different address rather it has same string 
        // because using the new keyword to create the string allows the string duplication 
        
    }
    
 }