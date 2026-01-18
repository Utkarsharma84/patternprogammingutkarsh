import java.util.Arrays;
import java.util.Scanner;

public class lastRepeatingNum {
    static int  lastrepetingnum(int arr[]){
        int n =arr.length;
        for (int i=n-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of an array");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       int ans= lastrepetingnum(arr);
        System.out.println(ans);


    }
}
