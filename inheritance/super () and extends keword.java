class human{
private String sex ; //private memeber cant be accesed by derived class #encapsulation
int age;
human(){
System.out.println("human class constructor hu mai");
System.out.println(sex);
}
void show(){
    System.out.println("the age is  "+ age );
}
}
class student extends human{
    student(){      // by defaut added in the class when the object of the class is created
        super();  //default add super method of 0 parameterised
    }

}
class exeute{
    public static void main(String[] args) {
        student stud = new student ();
        stud.age=5;
        stud.show();
    }
}