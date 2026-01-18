import java.util.Scanner;

public class pr {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reveres(int arr[],int i,int j){
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }


    static void rotateinplace(int arr[],int k){
      int  n= arr.length;
        k= k%n;
        reveres(arr,n-k,n-1);
        reveres(arr,0,n-k-1);
        reveres(arr,0,n-1);
    }
//    static int[] rotate(int arr[],int k ){
//            int n = arr.length;
//            k=k%n;
//            int j = 0;
//            int ans []= new int[n];
//        for (int i =n-k;i<n;i++){
//                ans[j++]=arr[i];
//            }
//        for (int i =0;i<n-k;i++){
//            ans[j++]=arr[i];
//        }
//          return ans;
//    }

    static void printarray(int arr[]){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();;

        System.out.println("enter "+n+"elements of array ");
        int arr[]= new int[n];
        for (int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k ");
        int k = sc.nextInt();

       // int ans[]=rotate(arr,k);

        System.out.println("orignal array ");
        printarray(arr);

        System.out.println("array after rotate");
        rotateinplace(arr,k);
        printarray(arr);

    }
}
