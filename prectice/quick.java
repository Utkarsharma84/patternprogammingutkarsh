public  class quick {
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int x, int y) {
              int temp = arr[x];
              arr[x]= arr[y];
              arr[y]=temp;
    }
    static int partion(int arr[],int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i= st+1;i<=end;i++){
            if (arr[i]<=pivot)count++;
        }
         int pivotindex= st+count;
         swap(arr,st,pivotindex);

         int i = st;int j=end;
         while (i<pivotindex&&j>pivotindex){
             while (arr[i]<=pivot)i++;
             while (arr[j]>pivot)j--;
             if (i<pivotindex&&j>pivotindex){
                 swap(arr,i,j);
                 i++;
                 j--;
             }
         }
         return pivotindex;
    }
    static void quicksort(int arr[],int st ,int end){
        if (st>=end)return;
        int pi = partion(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 2, 0, 1, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("array before sorting");
        display(arr);
        System.out.println("array after sorting");
        quicksort(arr,0,arr.length-1);
        display(arr);

    }
}