import java.util.Arrays;

public class evenodd {
    static int[] ev_od(int[] arr){
        int evencount=0;
        int oddcount=0;
        for (int num:arr){
            if (num%2==0)evencount++;
            else oddcount++;
        }
        return new int[]{evencount,oddcount};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4};
        System.out.println(Arrays.toString(ev_od(arr)));
    }
}
