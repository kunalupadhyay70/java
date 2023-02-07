//programe to give the loan to farmer (static amd non static variable )
import java.util.Scanner;
class Farmer{
    int pa;
    float td;
    static float ri=8.5f;
    float si;
    void input()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println(" enter the amout you required for the loan");
         pa= scan.nextInt();
         System.out.println("enter the time duration ");
         td=scan.nextFloat();

    }
    void compute()
    {
        si=pa*ri*td/100f;
    }
    void disp(){
        System.out.println("the simple interest is : "+ si);

    }
    Farmer()   //constructor called when the class object will created
    {
        input();
        compute();
        disp();
    }}
    class launchFarmer{
        public static void main(String[] args) {
            Farmer f1=new Farmer();
            Farmer f2 =new Farmer();
        }
    }

