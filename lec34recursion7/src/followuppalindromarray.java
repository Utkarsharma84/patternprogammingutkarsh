import java.util.Scanner;

public class followuppalindromarray {
    static boolean palindromarray(int arr[],int l,int r){
        if (l>=r)return true;
        if (arr[l]!=arr[r])return false;
        return palindromarray(arr,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,2,1};
//        int n = sc.nextInt();
//        int arr[]= new int[n];
//        for (int i = 0; i <n; i++) {
//            arr[i]= sc.nextInt();}

        System.out.println(palindromarray(arr,0,arr.length-1));
    }
}
