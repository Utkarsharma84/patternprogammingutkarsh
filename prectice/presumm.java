import java.util.Scanner;

public class presumm {
    static void printarray(int arr []){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] presum(int arr[]) {
        int n = arr.length;
        for (int i=1;i<n;i++) {
        arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int ar[]= new int[n];
            for (int i =0;i<ar.length;i++){
                ar[i]=sc.nextInt();
        }
           int arr[]= presum(ar);
            printarray(arr);

    }
}