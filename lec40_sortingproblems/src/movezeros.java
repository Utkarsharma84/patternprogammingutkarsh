public class movezeros{
    static void movezeross(int arr[]){
        for (int i =1;i<arr.length;i++){
            boolean flag = false;
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]==0&&arr[j+1]!=0){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                    flag = true;
                }
            }
            if (flag==false){
                return;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,5,0,5,0,6,8,0,0,6,8,0,33,0};
        movezeross(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}