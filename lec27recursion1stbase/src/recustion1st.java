import java.util.Scanner;

public class recustion1st {
    static void printintcreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        // first recursive work
        printintcreasing(n-1);
        // then self work
        System.out.println(n);
    }
    static void printdecresing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
// first self work
        System.out.println(n);
// then recursive work
       printdecresing(n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
      //  printintcreasing(n);
        printdecresing(n);
    }
}
