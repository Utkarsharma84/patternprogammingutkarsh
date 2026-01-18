import java.util.Scanner;

public class partitionarray {
    static int findarraysum(int arr[]) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equelsumpartition(int arr[]){
        int totalsum=findarraysum(arr);

        int prefsum =0;
        for (int i =0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum=totalsum-prefsum;
            if (suffixsum==prefsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+n+"elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prefsum=findarraysum(arr);
        System.out.println("equal partition possible "+equelsumpartition(arr));
        
    }
}
