class demo{
  void a()throws Exception{
        b();
    }
    void b()throws Exception
    {
     int n1=6,n2=0;
      int res =n1/n2;
      System.out.println(res);
    }
}
public class ThrowsException{
    public static void main(String[] args) {
      try{
        file obj= new file();
        obj.a();
    }
    catch(Exception e){
        System.out.println("error"+e);
    }
}

}
