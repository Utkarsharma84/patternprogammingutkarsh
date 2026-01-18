public class lastoccurance {
    static int lastoccuranceidx(int[] arr,int target){
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==target)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,0};
        int target = 2;
        System.out.println(lastoccuranceidx(arr,target));
    }
}
