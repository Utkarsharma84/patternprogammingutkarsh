import java.util.Scanner;

public class multiply {
    static void printmultiples(int num,int k ){
//
//        //base case
//        if (k==1){
//            System.out.println(num);
//            return;
//        }
        if (k==0)return;

        //recursive work
        printmultiples(num,k-1);

        //self work
        System.out.println(num*k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k= sc.nextInt();
       printmultiples(num,k);
    }
}
