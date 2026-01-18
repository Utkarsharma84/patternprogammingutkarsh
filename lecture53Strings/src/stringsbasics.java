import java.util.*;
public class stringsbasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = "utkarsh sharma";
        String str = "hello";

        System.out.println(str);
//        String s = sc.next()/;
//        String s = sc.nextLine();
    //    System.out.println(s);

//        int len = str.length();
//        System.out.println(len);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("u"));
        String gtr = "dello";
        System.out.println(str.compareTo(gtr)); //4 lexographycally
        System.out.println(str.contains("ello"));
        System.out.println(str.startsWith("he"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));





    }
}
