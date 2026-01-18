import java.util.Scanner;

public class presentquery {

    static int[] makefreqvancyarray(int[] arr) {
           int n=arr.length;
           int [] freq = new int[100005];
           for (int i =0;i<n;i++){
               int num = arr[i];
               freq[num]++;
//               freq[arr[i]
//                ]++;
           }
           return freq;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int n = sc.nextInt();

        int arr []=new int[n];
        System.out.println("enter "+n+"elements");
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] freq = makefreqvancyarray(arr);

        System.out.println("enter no.of query  ");
        int q= sc.nextInt();



        while(q>0){
            System.out.print("enter no. to be searched ");
            int x= sc.nextInt();

            if (freq[x]>0){
                System.out.println("yes");}
                else{
                    System.out.println("no");}
               q--;
            }



    }
}

