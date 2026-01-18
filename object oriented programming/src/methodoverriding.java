public class methodoverriding {
    public static void main(String[] args) {
     janver j = new janver();
     j.eat();
     dear d = new dear();
     d.eat();
    }
}
class janver{
    void eat(){
        System.out.println("eat anything");
    }
}
class dear extends janver{
    void eat(){
        System.out.println("eat grass only");
    }
        }