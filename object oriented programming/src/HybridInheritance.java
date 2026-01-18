//public class HybridInheritance {
//    public static void main(String[] args) {
//        Shark s1 = new Shark();
//        s1.swim();
//        s1.veryBig();
//        s1.sleeping();
//        s1.breath();
//
//        Mammals m1 = new Mammals();
//        m1.cat();
//        m1.dog();
//        m1.human();
//        m1.sleeping();
//        m1.breath();
//
//        Fish f1 = new Fish();
//        f1.swim();
//        f1.sleeping();
//    }
//}
//    class Animal {
//    void breath() {
//        System.out.println("breathing");
//    }
//    void sleeping() {
//        System.out.println("sleeping");
//    }
//}
//
//class Fish extends Animal {
//    void swim() {
//        System.out.println("swimming in water");
//    }
//}
//
//class Shark extends Fish {
//    void veryBig() {
//        System.out.println("big shark in sea");
//    }
//}
//
//class Birds extends Animal {
//    void fly() {
//        System.out.println("I'm here to fly");
//    }
//}
//
//class Peacock extends Birds {
//    void dancing() {
//        System.out.println("I'm dancing");
//    }
//}
//
//class Mammals extends Animal {
//    void dog() {
//        System.out.println("barking");
//    }
//    void cat() {
//        System.out.println("I am cat");
//    }
//    void human() {
//        System.out.println("I am intelligent");
//    }
//}
