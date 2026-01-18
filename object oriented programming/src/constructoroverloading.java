public class constructoroverloading {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("us");
        System.out.println(s2.name);
        student s3 = new student(57);
        System.out.println(s3.roll);
    }
     static class student{
        String name;
        int roll;
        student(){
            System.out.println("default constructor...");
        }
        student(String name){
            this.name=name;

        }
        student(int roll){
            this.roll=roll;
        }
    }
}
