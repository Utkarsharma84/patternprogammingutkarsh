public class bubble{
    static void bubblesort(int arr[]){
        for (int i =0;i<arr.length-1;i++){
            boolean flag = false;
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag = true;
                }
            }
            if (flag==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
     int[] arr = {1,2,5,3,5,852,8,5,2};
     bubblesort(arr);
     for (int i : arr){
         System.out.print(i+" ");
     }
    }
}
