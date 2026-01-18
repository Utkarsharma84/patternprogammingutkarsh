public class comparearray {
    public static boolean compare(int[] arr,int arr2[]) {
        if (arr.length != arr2.length) return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4};
        int[] arr2 = {1,2,3,4};
        System.out.println(compare(arr,arr2));
    }
}
