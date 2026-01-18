public class average {
    static int average(int[] arr){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int ans =sum/arr.length;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1};
        System.out.println(average(arr));
    }
}
