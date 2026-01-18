public class inheritance {
    public static void main(String[] args) {
       fish f = new fish();
       f.eat();
       f.swim();
       f.colour="blue";
        System.out.println(f.colour);
      }
}
//parent / base class
  class aAnimal{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
         System.out.println("breathes");
    }
}
//derived class
class fish extends aAnimal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
class mammal extends aAnimal{
    int leg;
    void walk(){
        System.out.println("walks");
    }
}
class bird extends aAnimal{
    void fly(){
        System.out.println("fly");
    }
}