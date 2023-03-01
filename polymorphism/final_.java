class animal{
    final void sleep(){
        System.out.println("sota hai tota");
    }
}
class cow extends animal{
// void sleep() {  cannot override the final method 
//but it can be inherited in  the child class 
}

public class final_{
    public static void main(String[] args) {
        cow c= new cow();
        c.sleep();//can be inherited to child or derived class 
    }
}