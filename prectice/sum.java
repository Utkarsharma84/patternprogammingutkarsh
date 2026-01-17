import java.util.Scanner;

public class sum {

    static int sum0farray(int []arr,int idx){
        //base case
        int n = arr.length;
        if (idx==n) return 0;
        // recurssive work
        int smallans= sum0farray(arr,idx+1);
        //self work
        return smallans+arr[idx];

    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        int arr[]={1,2,3,4,5};
        System.out.println(sum0farray(arr,0));

    }
}
