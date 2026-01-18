import java.util.Arrays;

public class rightshift {
    static int[] right(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        for (int i =n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(right(arr)));
    }
}
