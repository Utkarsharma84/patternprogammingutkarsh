public class insertion{
    static void insertionsort(int arr[]){
        for (int i = 1;i<arr.length;i++){
            int j = i;
            while (j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,4,0,544,5,4,5,6,8,66,6,5,};
        insertionsort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}