public class StaticPriority {
    
}
//import java.io.IOException;
public class staticExplain{
    static int age ;
    static{
        age =18;
        System.out.println("yeh staic block hai dada  ");
        System.out.println(age);
    }
    static void show(){
        System.out.println ("yeh static method jab hum main ke bad call krenge tab ayyega  ");
    }
   public static void main(String...args)//throws IOException,InterruptedException {
        // new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
      {  System.out.println("yeh main method hai ");
        show(); //we are able to call it without making its instance or an object 
    }
}
 