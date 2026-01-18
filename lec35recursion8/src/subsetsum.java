public class subsetsum {
    static void subsetsum(int arr[],int n ,int idx,int sum){
        if (idx>=n){
            System.out.println(sum);
            return;
        }
        subsetsum(arr,n,idx+1,arr[idx]+sum); // include
        subsetsum(arr,n,idx+1,sum); //exclude

    }
    public static void main(String[] args) {
        int arr[]= {2,4,5};
        subsetsum(arr,arr.length,0,0);

    }
}
//input - {2,4,5};
//output - 0 2 4 5 6 7 9 11