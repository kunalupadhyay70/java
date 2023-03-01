package polymorphism;
//abstracted class that have method with undefine defination
abstract class hero { 
    abstract void show();//undefined method 
    abstract  void stunt();
}
class kunal extends hero{
    void show(){
        System.out.println("meara look haitagda fagda");
    }
    void stunt(){
        System.out.println("tiger fail hai tere bhai ke samne ");
    }
}
public class runAbstract  {
    
    public static void main(String args[]){
        kunal k= new kunal();
        k.show();
        k.stunt();
        // hero h= new hero();
        // h.show();        
    }
}
