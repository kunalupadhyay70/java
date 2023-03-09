public class multiException {
    public static void main(String[] args) {
        int n1=6;
        int n2=4;
        int res=0;
        String name = null;
        int values[]={2,5,8,3};
        try{
             res=n1/n2; // 1'st critical statment
             res= n1/name.length();//2nd 
             System.out.println(values[5]);//3rd
        }
        catch(ArithmeticException e)
        {
            System.out.println("denominater cant be 0    "+ e );
        }
        catch(NullPointerException e) // for the 2nd critical statement in the try block
        {
            System.out.println("string is empty ...\n"+e);
        }
        catch(ArrayIndexOutOfBoundsException e) //3rd critical statement 
        {
            System.out.println("the index u want to excess doesnt exist");
        }
        catch (Exception e) // for the exception we dont know what can come 
        {
            System.out.println("something went wrong ...."+ e);
        }
        System.out.println(" result is "+ res);
        System.out.println("bye ..");
     }
}
