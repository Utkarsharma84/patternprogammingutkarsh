import java.util.Scanner;

public class findmax {
   static int max(int arr []){
        int min =Integer.MIN_VALUE;
        for (int i  =0;i<arr.length;i++){
            if (arr[i]>min){
                min=arr[i];
            }

        }
return min;

    }
    static int secondmax(int arr[]){
       int mx =  findmax.max(arr);
       for (int i=0;i<arr.length;i++){
           if (arr[i]==mx){
               arr[i]=Integer.MIN_VALUE;
           }
       }
       int secondmax= findmax.max(arr);
       return secondmax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("maxelementis "+ findmax.max(arr));
        System.out.println("secondmax element is : "+findmax.secondmax(arr));
    }
    }
