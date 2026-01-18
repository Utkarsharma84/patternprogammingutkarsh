import java.util.Arrays;

public class leftshift {
    static int[] shiftbyone(int[]arr){
        if (arr.length==0)return new int[0];
        int first = arr[0];
        for (int i=1;i< arr.length;i++) arr[i-1]=arr[i];
        arr[arr.length-1]=first;
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shiftbyone(arr)));
    }
}
