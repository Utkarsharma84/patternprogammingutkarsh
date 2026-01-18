import java.util.Scanner;

public class basicstring {
    public static void main(String[] args) {
//        String s ="collage";
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(s);
        // arr={1 0 2 4 },arr[0]
        char ch= s.charAt(0);
        /*
        arr.length
        utkarsh
        0123456
        so u is at 0 index
        */
//        for (int i =0;i<s.length();i++){
//            System.out.print(s.charAt(i)+",");
//        }
        System.out.println(s.substring(0,7)); //dono index dena compulsaru nhi hai koi ek bhi de skte hai pr usme pura print hota hai last tak
    }
}
