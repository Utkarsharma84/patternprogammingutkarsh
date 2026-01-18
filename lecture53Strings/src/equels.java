public class equels {
    public static void main(String[] args) {
       String s1 = "hello" ;
       String s2 = "hello" ;
       String s3 = new String("hello");
        System.out.println(s1==s2); // true
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3)); // true
    }
}

// string 1 and string 2 equal hai pr string 3 nhi hai