import java.util.Arrays;
import java.util.Scanner;
public class rotatestaptwo{
    static void printarray(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    static void reverse(int[]arr,int i ,int j){
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
         arr[i]= arr[j];
         arr[j]= temp;
    }
    static void rotateinplace(int[] arr,int k){
        int n = arr.length;
        k =  k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter size of array");
        int n =sc.nextInt();

        int []arr =new int[n];
        System.out.println("enter "+n+" elements of an array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter k ");
        int k = sc.nextInt();

        System.out.println("erray befor rotate ");
        printarray(arr);

        System.out.println("array after rotate ");
        // int[] ans = rotate(arr,k);
        rotateinplace(arr,k);
        printarray(arr);
    }
}
