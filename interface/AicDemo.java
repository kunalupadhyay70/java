// package interface ;
// @FunctionalInterface
interface car{
    void drive();
     default void speed(){
        System.out.println("speed less is good ");
    }
}
class AicDemo{
    public static void main(String[] args) {
    // annonymous inner class  
        car obj= new car(){
            public void drive(){
                System.out.println("driving....");
            }
        };
        obj.drive();

    }
}