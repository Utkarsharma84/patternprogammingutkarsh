public class alternates {
    static int alternat(int n ){
        if (n==0)
                return 0;
        if (n%2==0){
                return alternat(n-1)-n;
        }else{
                return alternat(n-1)+n;
    }
    }

    public static void main(String[] args) {
        System.out.println(alternat(5));
    }
}
