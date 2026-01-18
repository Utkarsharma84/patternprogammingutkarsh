import java.util.Arrays;

public class replacenumber {
    static int[] replace(int[] arr , int n){
        int x= arr.length;
        for (int i =0;i<x;i++){
            if (arr[i]==n) {
                arr[i] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,5,3,5};
        int n = 5;
        System.out.println(Arrays.toString(replace(arr,n)));
    }
}
