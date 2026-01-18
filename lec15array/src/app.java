 class us {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changearray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }


      static void change_val(int a){
           int x = 1440;
     }


}
public class app {
    public static void main(String[] args) {
        int a = 5;
        us.change_val(a);
        System.out.println(a);
        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        us.changearray(arr);
        us.printarray(arr);
    }
}