public class liniarsearchCode {
    static int liniar(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int target =5;
        System.out.println(liniar(arr,target));
    }
}
