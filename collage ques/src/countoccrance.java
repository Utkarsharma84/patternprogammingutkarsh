import javax.xml.transform.stax.StAXResult;

public class countoccrance {
    static int count(int[] arr,int target){
        int ans  = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,5,5};
        int target = 5;

        System.out.println(count(arr,target));
    }
}
