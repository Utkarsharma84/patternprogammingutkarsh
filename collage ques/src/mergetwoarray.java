import java.util.Arrays;

public class mergetwoarray {
    static int[] mergearray(int[] arr,int[] arr2){
        int n =arr.length+arr2.length;
        int[] ans = new int[n];
        int k =0;
        for (int i =0;i<arr.length&&k<n;i++) {
            ans[k++]=arr[i];
        }
        for (int j =0;j<arr2.length&&k<n;j++){
        ans[k++]=arr2[j];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 ={4,5,6,7};
        System.out.println(Arrays.toString(mergearray(arr,arr2)));
    }
}
