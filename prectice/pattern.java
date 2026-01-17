import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n;
        int star = 0;

        for(int i = n; i <=0; i--){
            for(int j = 0; j >star; j++) System.out.print("*");
            for(int j=space; j <star; j--) System.out.print(" ");
            System.out.println();
            star--;
            space++;
        }
    }
}
