public class rec6 {
    static int rec(int[]arr,int target ,int idx) {
        if (idx == arr.length) return -1;
        if (target == arr[idx]) return arr[idx];
        return rec(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,49};
        System.out.println(rec(arr,5,0));
      }
    }
