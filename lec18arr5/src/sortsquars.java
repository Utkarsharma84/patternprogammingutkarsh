import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class sortsquars {
    static void printarray(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] sortsquares(int []arr){
        int n = arr.length;
        int left =0, right=n-1;
        int ans []= new int[n];
       // int k =0; isme reverse krne ki jarurat pedegi last m
        int k=n-1;
    while(left<=right){
        if (Math.abs(arr[left])>Math.abs(arr[right])){
           // ans[k++]=arr[left]*arr[left];
            ans[k--]=arr[left]*arr[left];
            left++;
        }
        else {
          //  ans[k++]=arr[right]*arr[right];
            ans[k--]=arr[right]*arr[right];
            right--;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter size of array");
        int n =sc.nextInt();

        int []arr =new int[n];
        System.out.println("enter "+n+" elements of an array ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("orignal array");
        printarray(arr);
        System.out.println("sorted array");
        int ans []= sortsquares(arr);
        printarray(ans);
    }
}

// input = -10,-3,-2,1,4,5
//output = 1 4 9 16 25 100