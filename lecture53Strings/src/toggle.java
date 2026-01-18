import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        //PHysiCs -> phYSIcS
        for(int i = 0;i<str.length();i++){
            //  P->p
            // check -> alphabet , capital hai ya small
            boolean flag = true; //true -> capital
            char ch = str.charAt(i);
            if (ch ==' ')continue;
            if (Character.isDigit(ch)){
                str.deleteCharAt(i);
                i--;
                continue;
            }
            int asci = (int) ch;
            if (asci>=97) flag =false;
            if (flag==true){
                asci +=32;
                char ah = (char)asci;
                str.setCharAt(i,ah);
            }
            else {//small
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
