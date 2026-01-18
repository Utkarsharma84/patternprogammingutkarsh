import java.util.Arrays;

public class sortindesendingorder {
    static int[] sortdec(int[] arr){
        // Step 1: sort ascending
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] ans = new int[arr.length];
        int m = 0;
        for (int k = arr.length - 1; k >= 0; k--) {
            ans[m++] = arr[k];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,7,8,4,5,6};
        System.out.println(Arrays.toString(sortdec(arr)));
    }
}
