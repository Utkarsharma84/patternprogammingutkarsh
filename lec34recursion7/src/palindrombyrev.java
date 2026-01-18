import java.util.Scanner;

public class palindrombyrev {

    static String revers(String s){
        if (s.length()==0)return"";
        String smallans =revers(s.substring(1));
        return smallans+s.charAt(0);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String REV =revers(s);
        if (REV.equals(s)){
            System.out.printf("%s is palindrome",s);
        }else {
            System.out.printf("%s is not palindrome",s);
        }
        }

    }

