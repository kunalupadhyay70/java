
class  TestThrowFunction{
    //defining method 
    public void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException(); 
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
}
public class TestThrow {  
     //main method  
    public static void main(String[] args) {  
           TestThrowFunction obj = new TestThrowFunction();  
            obj.checkNum(-3);  
            System.out.println("Rest of the code..");  
    }  
}  
