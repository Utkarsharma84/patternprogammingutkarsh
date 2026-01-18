public class fibonacci {
    static int fib(int n ){
        if (n==0||n==1){
            return n;}
        //recursive work
        int prev = fib(n-1);
        int prevprev=fib(n-2);
        // swlf work
        int ans = prev+prevprev;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
