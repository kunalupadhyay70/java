//check whether the alphabets are present in the string or not 
class pangram{
   public static void main(String[] args) {
     boolean flag=false;
    String s= "mai hoon hero ka papa";
     // convert them in the sequantial manner (upper case )( lower case)
     s=s.toUpperCase();
     //remove all the whitespaces 
     s= s.replace(" ", "");
     // convert the string into the array to traverse the array
     char ch[]=s.toCharArray();
     int ar[]= new int[26];//empty array for getting the result of plus or mius of the output 
     //traverse the element of the array 
     for(int i=0;i<ch.length;i++)
      {
        ar[ch[i]-65]++; // checking the every digit with its asci code 
      }
      for (int i=0; i<ar.length;i++)
      {
        if (ar[i]==0)
       { flag =true;}
     }   if (flag==true)
        System.out.println("pangram nhi hai yeh ( sabhi character nhi hai string mai include )"   );
        else 
        System.out.println("pangram hai");
}}