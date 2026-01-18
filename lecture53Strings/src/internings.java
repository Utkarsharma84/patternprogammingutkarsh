import java.util.*;
public class internings {
    public static void main(String[] args) {
        String s = "hello";
//        String x = "hello";
//        x = "mello";
//        System.out.println(s);
        // 2 = 'y';
         s = s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);
    }
}   // string me hr baar same name ki string banane me heap me nai memort banti hai jo ki iternings kahlati hai or isse bachne ke liye or sequrity reasons ke liye immutibility ka use hota hai
