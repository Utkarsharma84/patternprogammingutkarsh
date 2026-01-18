import javax.naming.PartialResultException;
import java.util.Scanner;

public class micsquestion2 {

    static void  printarray(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" "+ar[i]);
        }
        System.out.println();

    }
    static int[] rotate(int[]arr,int k){
        int n =arr.length;
         k =k%n;
        int []ans= new int[n];
        int j=0;

        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
    }
        return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n= sc.nextInt();

        int[] ar=new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }

        System.out.println("inter k ");
        int k = sc.nextInt();


        System.out.println("orignal array is");
        printarray(ar);

        int[] ans = rotate(ar,k);
        System.out.println("array after rotation");
        printarray(ans);



    }
}
