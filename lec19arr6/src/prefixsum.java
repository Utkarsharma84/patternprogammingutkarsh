import java.util.Scanner;

public class prefixsum {
    static void printarray(int arr []){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//
    static int [] makeprefixsumarray(int arr[]){
        for (int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+n+"elements of an array");
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("orignal array ");
        printarray(arr);


        System.out.println("prefix sum of array");
        int[] pref = makeprefixsumarray(arr);
        printarray(pref);

    }
}
//input = 2 1 3 4 5
//output =2 3 6 10 15
