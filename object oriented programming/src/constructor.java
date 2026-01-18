public class constructor {
    public static void main(String[] args) {
        student s1 = new student("us");
        System.out.println(s1.name);
    }
   static class student{
        String name;
        int roll;

         student(String name){
//             System.out.println("constuctor is called.....");
                this.name=name;
        }
    }
}
