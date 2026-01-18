import java.util.Scanner;

public class sortarray{
    static void printarray(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i]  = arr [j];
        arr[j]  = temp;
    }
//    static void sortzeroesandones(int arr[]){
//        int n = arr.length;
//        int left =0, right= n-1;
//        while (left<right){
//            if (arr[left]==1&&arr[right]==0){
//                swap(arr,left,right);
//                left++;
//                right--;
//            }
//            if (arr[left]==0){
//                left++;
//            }
//            if (arr[right]==1){
//                right--;
//            }
//        }
//    }

//    static void sortzerosandone(int arr[]) {
//        int n = arr.length;
//        int zeroes = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                zeroes++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (i < zeroes) {
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }
//        }
//    }

    static void sortarraybyparity(int arr[]) {
        int st = 0, end = arr.length - 1;

        while (st < end) {
            if (arr[st] % 2 == 1 && arr[end] % 2 == 0) {
                swap(arr, st, end);
                st++;
                end--;
            } else if (arr[st] % 2 == 0) {
                st++;
            } else if (arr[end] % 2 == 1) {
                end--;
            }
        }
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
            System.out.println("orignal array ");
            printarray(arr);
            System.out.println("sorted array ");
           // sortzeroesandones(arr);
            sortarraybyparity(arr);
            printarray(arr);
        }
    }
