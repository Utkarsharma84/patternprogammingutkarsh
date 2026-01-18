import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seprateintwoarrays {
//    static int[][] separateEvenOdd(int[] arr) {
//        int even = 0, odd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                even++;
//            } else odd++;
//        }
//
//        int[] ans = new int[even];
//        int[] ans2 = new int[odd];
//
//         int i =0,j=0;
//        for (int num:arr) {
//            if (num % 2 == 0) {
//                ans[i++] = num;
//            } else {
//                ans2[j++] = num;
//            }
//        }
//        return new int[][]{ans,ans2};
//    }

public static List<List<Integer>> separateEvenOdd(int[] arr) {
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();
    for (int num : arr) {
        if (num % 2 == 0) even.add(num);
        else odd.add(num);
    }
    List<List<Integer>> result = new ArrayList<>();
    result.add(odd);
    result.add(even);
    return result;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
//        int [][] result= seprateintwoarrays.separateEvenOdd(arr);
        System.out.println(separateEvenOdd(arr));
//        System.out.println(Arrays.deepToString(result));
    }
}
