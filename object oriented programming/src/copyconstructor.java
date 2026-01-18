public class copyconstructor {
        public static void main(String[] args) {
            student s1 = new student();
            s1.name="utkarsh";
            s1.roll=57;
            s1.password="abcd";
            s1.marks[0]=100;
            s1.marks[1]=90;
            s1.marks[2]=80;

            student s2 = new student(s1);//copy
            s2.password = "xyz";
            System.out.println(s2.name);
            System.out.println(s2.roll);
            System.out.println(s2.password);
            s1.marks[2]=100;
           for (int i =0;i<3;i++){
               System.out.println(s2.marks[i]);
           }


        }

    static class student{
        String name;
        int roll;
        String password;
        int marks[];

        // shallow copy constructor
        student(student s1){
            marks = new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            this.marks = s1.marks;
        }

// //     deep copy constructor
//        student(student s1){
//            marks = new int[3];
//            this.name=s1.name;
//            this.roll=s1.roll;
//            for (int i =0;i<marks.length;i++){
//                this.marks[i] = s1.marks[i];
//            }
//        }

        student(){
            marks = new int[3];
            System.out.println("default constructor...");
        }
        student(String name){
            marks = new int[3];
            this.name=name;
        }
        student(int roll){
            marks = new int[3];
            this.roll=roll;
        }
    }
}

