public class arrsumm {
    static int arrs(int[] arr,int idx){
        if (idx==arr.length)return 0;
        int smallans = arrs(arr,idx+1);
         return smallans+arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(arrs(arr,0));

    }
    }