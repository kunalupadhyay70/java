 // all basic program of the array
import java.io.IOException;
import java.util.Scanner;
class claculation{
    public int clacu(int a[][])
    {
        int result =0;
        // for each loop to count the sum of the array element 
        for(int i[]:a)
        for (int b : i)   
        {
            result +=b;
        }
        return result;
    }
}
class array{
public static void main(String...args)throws IOException, InterruptedException {
        //for clearing the console 
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
      //block for the taking input from programme and print the array 
       { Scanner scan = new Scanner(System.in);
          System.out.println("enter the element of the array");
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++) //for taking input
        for(int j=0;j<3;j++)
        a[i][j]=scan.nextInt();
        System.out.println("elemets are "); //for printing the array 
        for(int i=0;i<3;i++)
        {for(int j=0;j<3;j++)
        System.out.print(a[i][j] +" ");
        System.out.println();}
        //sum of the array element using the or each loop
        claculation obj=new claculation();
        System.out.println("sum of the array is "+obj.clacu(a));
        }
        int nums[][]={
            {3,9,7,5},
            {1,5,6,5},
            {8,4,5,6}
        };
        //using the foreach loop 
        System.out.println("from the for each loop");
        for(int i[]:nums)
        {
            for(int b:i)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        } 
        System.out.println("\n from the iteration of the loop");
//from the iteration of the for loop
for(int i=0;i<=2;i++)
{
for(int j=0;j<=3;j++)
{
System.out.print(nums[i][j]+ " ");
}
System.out.println();
}
    }
}