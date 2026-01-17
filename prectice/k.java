import java.util.Scanner;
public class k {
    static int factorial(int n){
        if (n==0)return 0;
        if (n%2==0){
            return factorial(n-1)-n;
        }else {
            return factorial(n-1)+n;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
