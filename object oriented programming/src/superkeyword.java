public class superkeyword {
    public static void main(String[] args) {
    chimpanji c1 = new chimpanji();
        System.out.println(c1.colour);
    }
}
class animalss{
    String colour;
    animalss() {
        System.out.println("animal consturtor is called");
    }
}

class chimpanji extends animalss{
    chimpanji(){
        super.colour="brown";
        System.out.println("chimpanji consturtor is called");
    }
}
// agr hum super keyword nhi likhte hai to java me bi default constuctor super hi use hota hai