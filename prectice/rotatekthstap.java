import java.util.Arrays;
import java.util.Scanner;

public class rotatekthstap {
    static int[] rotate (int[] arr,int k){
        int n= arr.length;
        int[] ans= new int[n];
          k = k%n;
          int j=0;
        for (int i =n-k;i<n;i++){
            ans[j++]=arr[i];

        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans ;

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int []arr={1,2,3,4,5,6};
        int k = 7;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
}
