import java.util.*;
public class abstraction {
    public static void main(String[] args) {
//     horse myhorse = new horse();
//     myhorse.eat();
//     myhorse.walk();
//
//     System.out.println(myhorse.colour);
//     chicken c = new chicken();
//     c.eat();
//     c.walk();
     mustang m = new mustang();
 // constructor is calling
//    animal -> house -> mustang
    }
}
abstract  class animal {
    String colour;

    animal(){
        System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class horse extends animal{
    horse(){
        System.out.println("horse constructor is called");
    }
    void changecolor(){
        colour ="dark brown";
    }
    void walk(){
        System.out.println("walk on four leg ");
    }
}
class mustang extends horse{
         mustang(){
        System.out.println("mustang constructor is called");
    }
}
class chicken extends animal{
    void changecolor(){
        colour ="yellow";
    }
    void walk(){
        System.out.println("walk on two legs");
    }
}