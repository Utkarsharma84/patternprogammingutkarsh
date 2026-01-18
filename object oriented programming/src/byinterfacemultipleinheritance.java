public class byinterfacemultipleinheritance {
    public static void main(String[] args) {
        bear b1 = new bear();
        b1.eat();
        b1.lazy();
    }
}

interface herbivore{
    void eat();
}
interface carnivore{
    void eat();
    void lazy();
}

class bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("eat both veg and non-veg");
    }
    public void lazy(){
        System.out.println("sleeping time is very long");
    }
}