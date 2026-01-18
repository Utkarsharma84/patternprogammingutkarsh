public class micsprobles {


    static int[] reversearray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        //array trverse in reverse direction
        for (int i = n - 1; i >=0; i--) {
            ans[j++] = arr[i];

        }
        return ans;
    }


//    static void swap(int a,int b){
//
//        System.out.println("valuve before swap");
//        System.out.println("a :"+a);
//        System.out.println("b :"+b);
//     int temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println("value after swap");
//        System.out.println("a : "+a);
//        System.out.println("b :"+b);


    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
//        int a=3;
//        int b=9;
        int arr[]={1,2,3,4,5};
       // swap(a,b);
       int [] ans= reversearray(arr);
       printarray(ans);
    }
}
