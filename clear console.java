import java.io.IOException;  
class ClearScreenExample3  
{  
public static void main(String... arg) throws IOException, InterruptedException   
{  
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
}   
}

