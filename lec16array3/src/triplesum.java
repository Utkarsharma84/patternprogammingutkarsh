public class triplessum {
    static int triplesum(int arr[], int target){
        int n = arr.length;
        int count = 0;
        for (int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
                for (int k=j+i;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target)
                        count++;
                }

            }
        }
        return count;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size 0f array: ");
    int n = sc.nextInt();

    int arr[]=new int[n];
    System.out.println("enter "+n+"elemnts of array");
    for (int i = 0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter target ");
    int target = sc.nextInt();

    System.out.println("tripal sum is "+triplessum.triplesum(arr,target));

}
