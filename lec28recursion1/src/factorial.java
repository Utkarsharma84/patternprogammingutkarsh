public class factorial {
    static int factorial(int n ){
        if (n==0) return 1; //base case
      // int smallans= factorial(n-1);//recursive work subproblem

//        // self work
//        int ans=n*smallans;
        return n  * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5  ));
    }
}
// isme code chota krne ke liye direct hr ye kr skte hai return bina variale me store kraye