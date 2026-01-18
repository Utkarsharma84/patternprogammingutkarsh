import java.util.Scanner;

public class reversestring {

    static String reverse2(String s){
        if (s.length()==0)return " ";
        String smallans= reverse2(s.substring(1));
        return smallans+s.charAt(0);


//    static String reverse(String s,int idx){
//        if (idx==s.length())return " ";
//        String smallans= reverse(s,idx+1);
//        return smallans+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse2(s));
    }
}
