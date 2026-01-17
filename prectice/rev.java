import java.util.Scanner;

public class rev {
    static boolean revst(String s,int l,int r){
      if (l>=r)return true;
      return s.charAt(l)==s.charAt(r)&&revst(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        boolean ans = revst(s,0,s.length()-1);
        if (revst(s,0,s.length()-1)){
            System.out.println("palindrom");
        }else System.out.println("not palindrom");
    }
}
