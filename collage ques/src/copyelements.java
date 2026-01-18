import java.util.Arrays;

public class copyelements {
    static int[] copyelementsfromarr(int[] arr){
        int ans[] = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        System.out.println(Arrays.toString(copyelementsfromarr(arr)));
    }
}
