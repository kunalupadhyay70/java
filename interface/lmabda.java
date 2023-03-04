// can only be used when interface is functional
//or have only one abstract method 
public class lmabda {
    public static void main(String[] args) {
        car obj= ()->{ System.out.println("driving ");};//from the interface we make the lamda expression 
        obj.drive(); //calling the annonymous class or the lambda function
    }
}