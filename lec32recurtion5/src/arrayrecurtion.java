package src;

import java.util.Map;

public class arrayrecurtion {
    static void printsarray(int arr[],int idx){  //5 6 7 8
       //base case
        if (idx==arr.length) return;
        // self work
        System.out.println(arr[idx]); //5
        // recurstive work
        printsarray(arr,idx+1); //6 7 8

    }


    static int Maxinarray(int arr[],int idx){
        int n = arr.length;
        int ans =0;
        if (idx==n-1) return arr[idx];

        // recurtive work
      int smallans = Maxinarray(arr,idx+1);


        // self work
         return Math.max(arr[idx],smallans);

    }


   static int Sumofarray(int arr[],int idx){
        int  n = arr.length;

//        if (idx==n-1)return arr[idx];
          if (idx==n) return 0; // for 0 size aarray
        int smallans= Sumofarray(arr,idx+1);

        return  (arr[idx]+smallans);

   }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        printsarray(arr,0);
//        System.out.println( Maxinarray(arr,0));
        System.out.println(Sumofarray(arr,0));
    }
}
