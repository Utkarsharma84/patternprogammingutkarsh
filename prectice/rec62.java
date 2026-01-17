import java.util.ArrayList;

public class rec62 {
//    static void pr(int[]arr,int target,int idx){
//        if (idx==arr.length) return ;
//        if (arr[idx]==target) System.out.print(idx+" ");
//         pr(arr,target,idx+1);
//    }

    static ArrayList<Integer> allindices(int[] arr, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx==arr.length)return ans;
        if (arr[idx]==target)ans.add(idx);
        ArrayList<Integer>  smallans= allindices(arr,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }

    public static void main(String[] args) {
   int arr[] = {1,2,3,4,2,6,2};
        //pr(arr,2,0);
        ArrayList<Integer> ans = allindices(arr,2,0);
        System.out.println(ans);
    }
}
