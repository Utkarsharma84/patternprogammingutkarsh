import java.util.Arrays;

public class rotatearraybykthsteps {
    static int[] leftshift(int[]arr,int k){
        int n= arr.length;
        k=k%n;
        int j=0;
        int[] ans = new int[n];

        for (int i =k;i<n;i++){
            ans[j++]=arr[i];

        }
        for (int i =0; i<k;i++){
            ans[j++]=arr[i];
        }


        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k =3;
        System.out.println(Arrays.toString(leftshift(arr,k)));
    }
}
