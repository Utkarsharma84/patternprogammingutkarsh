public class finderarray{
    static int finduniqes(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if (arr[i]==arr[j]){
                 arr[i]=-1;
                 arr[j]=-1;
              }
            }
        }
        int ans = -1;
        for (int i =0;i<n;i++) {
            ans = arr[i];
        }
            return ans;
        }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size of an array ");
    int n= sc.nextInt();

    System.out.println("enter "+n+"elements of array");
    int arr[]=new int[n];
    for (int i =0;i<n;i++){
       arr[i]=sc.nextInt();
    }

    System.out.print("the uniqe no is: ");
    System.out.println(finderarray.finduniqes(arr));
}