import java.util.Arrays;

public  class sortassending2 {
    static void sort(int[] arr){
             Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3,5,6};
         sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
