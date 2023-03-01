package polymorphism;

class vloging{
    public void daily(String name){
      System.out.println(name+"roj video banaunga mai toh ab se 20 din tak ");
    }
}
class dailyKunalsVlog extends vloging{
    public void daily(String name){
        System.out.println("mai roj video banata hun");
    }
}
class poly {

     void runtime_poly(vloging vlog)// making the refernce of the parent class 
     //so that it can store or accept all the object refernce 
     {
       vlog.daily("kunal"); //calling the class function eith the help of refrence
       // we except from function
    }}
public class runtimePoly {
    public static void main(String[] args) {
        dailyKunalsVlog kuk = new dailyKunalsVlog();
        poly p = new poly(); 
        p.runtime_poly(kuk);//adresss of the dailyKunalsVlog class 

    }
    
}
