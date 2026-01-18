import java.util.Scanner;

public class multidimentionalarray {
    static  void printarray(int[][]arr){
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows");
        int r= sc.nextInt();
        System.out.println("enter coloums");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];

        System.out.println("enter "+r*c+"elements");

            for (int i =0;i<r;i++){
                for (int j=0;j<c;j++){
                    arr[i][j]= sc.nextInt();
                }
            }


//     int arr2[][]={{1,5,6},
//                  {7,9,11},
//                  {8,1,1}
//                   };
     printarray(arr);
    }
}
