import java.util.Arrays;

public class kmulti {
    static void kkmul(int p , int k){
        if (k==0)return ;
        kkmul(p,k-1);
        System.out.println(p*k);
    }
    public static void main(String[] args) {
        kkmul(12,5);
    }
}
