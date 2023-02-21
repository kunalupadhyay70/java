 // classes are allowed to perform polymorphism  and overide the method 
 
 class pet {
        void eat(){  //overridding methods in chidren class 
            System.out.println("aaj mamla kharab hai sambhal lena ");
        }}
 class tatti extends pet{
 void eat(){  //overidden methods 
    System.out.println("aaj rang thoda kala ayega ");
 }
 }

 public class overiddenMethods{
public static void main(String[] args) {
    tatti t= new tatti();
    t.eat();
    pet p = new pet();
    p.eat();
}
}