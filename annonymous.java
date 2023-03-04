// annonymous array explanation 
public class annonymous {
    public static void sum(int[]a){
        int total=0;
        for(int i:a){
          total +=i;
        }
System.out.println("the sum is : "+total);
    }
public static void main(String[] args) {
annonymous.sum(new int[]{3,5,35,36});//using the array without name
} 
    
}
