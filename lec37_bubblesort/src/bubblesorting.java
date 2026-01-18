import java.util.Arrays;

public class bubblesorting {
    static void bubblesort(int[] arr){
        int n = arr.length;
        // n-1 iterations/passes
        for (int i =0;i<n-1;i++){
            boolean flag = false; // has any swapping happened
            for (int j=0;j<n-i-1;j++){//last index is also in correct position so that no need to check them
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
             //   if (flag== false) also write this insted of written this
                if (flag==false) return;
                // have any swap happened
            }
        }

    public static void main(String[] args) {
        int[] arr = {1,5,4,7,5,3,8,9};
        bubblesort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
