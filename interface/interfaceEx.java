import java.util.Scanner;
interface client //design of the idea that client wants to be implemented 
{
void input();// by default it is public static and abstract
void output();
}// the implelements keyword used to use interface
class develpoer implements client {
    String name;
    double salary ;
 public void input(){
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the name of you client ji ");
    name =scan.nextLine(); 
    System.out.println("salary kya doge  ");
    salary= scan.nextDouble();
    scan.close(); 
}
public void output(){
    System.out.println(name+" "+salary);
}
}
class interfaceEx{
    public static void main(String[] args) {
        client kunal= new develpoer();//making the refernce of the interface type
        kunal.input();
        kunal.output();
        
    }
}