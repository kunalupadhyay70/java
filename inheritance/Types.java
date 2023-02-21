 // single level inheritance for the linear method 
class base {
    base(){
System.out.println("single level inheritance");}
}
class derived1 extends base{

}
class derived2 extends derived1{

}
//multiple level inheritance 
class dog{
    dog(){
    System.out.println("mai kutta hun");
}}
class puppy1 extends dog{

}
class puppy2 extends dog{

}
class puppy3 extends dog{
}

public class Types{
   public static void main(String[] args) {
       derived2 obj= new derived2(); 
       puppy3 obj2= new puppy3();
   }}