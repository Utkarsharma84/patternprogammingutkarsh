public class fruits {
    static void movefruit(String[] arr){
        int n = arr.length;
        for (int i =0;i<n-1;i++){
            int minidx=i;
            for (int j =i+1;j<n;j++){
                if (arr[j].compareTo(arr[minidx])<0){
                    minidx=j;
                }
                String temp = arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        String [] arr = {"watermelon","papaya","mango","kiwi","apple"};
        movefruit(arr);
        for (String i:arr){
            System.out.print(i+" ");
        }
    }
}
