public class jaggedArray {
    public static void main(String[] args) {
        int [][]a= new int[3][];
        a[0]=new int[5];//first row has the 5 elements
        a[1]=new int[3];// second row has the 3 elements 
        a[2]= new int [1];
        System.out.println("the jagged array index is : ");
        for (int[] is : a) {
            for (int i : is) {
               System.out.print(i); // how the array look like
                
            }
            System.out.print("\n");
        }


    }
}
