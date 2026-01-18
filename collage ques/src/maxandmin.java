public class maxandmin {
    static int findmax(int[] arr){
     int max= arr[0];
     for (int i=0;i<arr.length;i++){
         if (max<=arr[i]){
             max=arr[i];
         }
     }
     return max;
    }

    static int findmin(int[] arr){
        int min =arr[0];
        for (int i =0;i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(findmax(arr));
        System.out.println(findmin(arr));

    }
}
