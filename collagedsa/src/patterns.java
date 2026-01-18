import java.util.Scanner;

public class patterns {
    static void pt1(int n){
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pt2(int n){
        for (int j=0;j<n-2;j++){
           for (int i =0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pt3(int n ){
        for (int i=1;i<=n;i++){
            for (int j =n;j<=i;j--) {

                if (i==j){
                    System.out.println("a");
                }
                else System.out.println("");
            }
        }
    }

    static void pt4(int  n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <=n; k++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
    static void pt5(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++)
               System.out.print("*");

            System.out.println();
        }
    }
    static void pt6(int n ){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j =i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
      static public void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n  = 4;
//        pt1(n);
//        pt2(n);
//        pt4(n);
        pt6(n);
    }
}
