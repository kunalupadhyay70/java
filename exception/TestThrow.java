
class  TestThrowFunction{
    //defining method 
    public void checkNum(int num)throws ArithmeticException {  
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
            try {obj.checkNum(-3);}
            catch(Exception e)  {
                System.out.println("error");
            }
            System.out.println("Rest of the code..");  
    }  
}  
