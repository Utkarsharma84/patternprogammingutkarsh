package pw.skills;

public class app {
    public String str_1 ="i am a public member";

    void printfromclass(){
        System.out.println("within class: "+str_1);

    }
    public static void main(String[] args) {
        app obj = new app();
        obj.printfromclass();
        System.out.println("within class: "+obj.str_1);
   
        app2 obj2 = new app2();
        obj2.printfromoutsideclass();
        


   
    }
    
}
class app2{
    void printfromoutsideclass(){
        app obj = new app();
        System.out.println("within package , outside class: "+obj.str_1);
    }

}