public class selection{
    static void selectionn(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int minidx=i;
            for (int j=i+1;j<n;j++){
                 if (arr[j]<arr[minidx]){
                     minidx=j;
                }
            }
                int temp = arr[i];
                arr[i]= arr[minidx];
                arr[minidx]= temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,66,7,55,7,5,8,1,4,6};
          selectionn(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}