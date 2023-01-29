// to print the diagonals
import java.util.Scanner;
class diagonals{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of pattern (length > 10 for clarity)");
        int n=sc.nextInt();
        sc.close();
        System.out.println("your pattern is :-> ");
        for(int i=0;i<n;i++)     //for outer body count at row wise 
        {
            for(int j=0;j<n;j++)   // count as coloumn wise 
            { if(i==j || i+j==n-1 || i+j== (n-1)/2 || i-j==(n-1)/2 || i+j==n-1+ (n-1)/2 ||j-i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}