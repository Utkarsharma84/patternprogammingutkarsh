import java.util.Arrays;

public class sortassending {
    static int[] sort(int[]arr){
        for (int i =0;i< arr.length;i++){
          for (int j =i+1;j<arr.length;j++) {
              if (arr[j]<arr[i]){
                  int temp = arr[i];
                  arr[i]= arr[j];
                  arr[j]=temp;
              }
        }
    }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,5,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
