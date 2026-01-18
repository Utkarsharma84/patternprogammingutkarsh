import java.util.Scanner;

public class rangequery {
    static int []prefixsum(int arr[]){
        for (int i=1;i<arr.length;i++){
            arr[i] +=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int arr[]= new int[n+1];

        System.out.println("enter "+n+" elements");
        for (int i = 1;i<=n;i++){
        arr[i]= sc.nextInt();
        }
        int prefsum []=prefixsum(arr);
        System.out.println("enter no. of query ");
        int q = sc.nextInt();

        while (q-->0){
            System.out.println("enter range ");
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans=prefsum[r]-prefsum[l-1];
            System.out.println("sum "+ans);
        }
    }
}
//enter array size
//5
//enter 5 elements
//1 2 3 4 5
//enter no. of query
//5
//enter range
//1 2
//sum 3
//enter range
//1 5
//sum 15
//enter range
//2 2
//sum 2
//enter range
//2 4
//sum 9
//enter range
//5 5
//sum 5

