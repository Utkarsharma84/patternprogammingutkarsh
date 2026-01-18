public class selectionsorting {
    static void selectionsort(int[] arr){
        int n = arr.length;
//        here i represent the current index
        for (int i = 0;i<n-1;i++){
//            find the minimum element in unsorted part of array
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
//          swap current element and minimum element -> current index i will have correct
//          a[min_index], a[i]
            int temp =arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,66,7,55,7,5,8,1,4,6};
        selectionsort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
