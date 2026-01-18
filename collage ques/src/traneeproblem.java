import java.util.Arrays;
import java.util.Scanner;

public class traneeproblem {
    static int[] trenee(int[]arr){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tr1 = new int[n];
        int[] tr2 = new int[n];
        int[] tr3 = new int[n];

        int ans[] =  new int[n];
        int a =0;
        for(int i =0;i<tr1.length;i++){

            }
        int b=0;
        for (int i =0;i<tr2.length;i++){
            b+=arr[i];
        }
        int c=0;
        for (int i =0;i<tr3.length;i++){
            c+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i:arr){
           arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(trenee(arr)));
     }
}

//pending