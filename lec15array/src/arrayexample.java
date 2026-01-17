import java.util.Arrays;
import java.util.Scanner;

public class arrayexample {
    static void printarray(int[]arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of array");
        //int n = sc.nextInt();
        int arr []=new int[5];
        arr [0]= 5;
        arr [1]= 6;
        arr [2]= 7;
        arr [3]= 8;
        arr [4]= 9;


//        for (int i=0;i< args.length;i++){
//            printarray(arr);
//        }

        System.out.println("orignal array");
        printarray(arr);

        //trying to copy arr to arr_2
        //yha pr deep copy krne ke liye clone function ka use huaa hai jisse ki arr or arr2 ko alag alg adress mila hai
       int [] arr2 = arr;
       //int []arr2=arr.clone();
       // int [] arr2= Arrays.copyOf(arr,4);
        // copy or copy of ka use hum lenth or range ke liye krte hai
       // int [] arr2=Arrays.copyOfRange(arr,0,3);
        System.out.println("copied arr2");
        printarray(arr2);

        // changing some value of arr_2

        arr2[0]=0;
        arr2[1]=0;
        System.out.println("original array after changing arr2");
        printarray(arr);
        System.out.println("copied array after changing arr2");
        printarray(arr2);

    }
}
// is program me value orignal or copied ki same aa rhi hai uska reasion ??
// ans -  kyuki merory me dono same address pr hai isliye ho rha hai and this is also called shallow copy


