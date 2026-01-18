public class insertionsorting {
    static void insertionsort(int[] arr){
        int n = arr.length;
        for (int i =1;i<n;i++){
            int j = i;
            while(j>0 &&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]   = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr =  {2,5,6,7,8,10,9,2,1,0,2,4,1};
        insertionsort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
// isme hum loop ko ek se chala rhe hai kyuki hum a[j-1] se compare kr rhe
// hai or agr vo a[j-1] mtlb uske baad wali value se chota hai to hum use swap kr rhe hai
// or j>0 wali condition ko hum yha pr last me compare na ho isliye lga rhe hai