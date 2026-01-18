import java.util.Arrays;

public class secondlargest {
    static int findlargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int secondlargest(int arr[]){
        int ans=findlargest(arr);
        for (int i =0;i<arr.length;i++){
            if (arr[i]==ans){
                arr[i]=-1;
            }

        }
        int anss =findlargest(arr);
        return anss;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,8,6,3,4,5};
        System.out.println(secondlargest(arr));

    }
}
