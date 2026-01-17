import java.util.Arrays;
import java.util.Scanner;

public class multi {
    static void printarray(int arr[][]){
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] multiplication(int arr1[][],int r1,int c1,int arr2 [][],int r2,int c2){
        int ans[][] = new int[r1][c2];
        for (int i=0; i < arr1.length; i++){
            for (int j=0; j < arr2[0].length; j++){
                for (int k=0; k< arr1.length;k++){
                   ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter row and coloum of matrix1");
        int r1 = sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("enter elements of an array ");
        for (int i =0;i<arr1.length;i++){
            for (int j=0;j<arr1[0].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter row and columns of second matrix");
        int r2 =sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("enter elements of an array2 ");
        for (int i =0;i<arr2.length;i++){
            for (int j=0;j<arr2[0].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        int anss [][]=multiplication(arr1,r1,c1,arr2,r2,c2);
        printarray(anss);
    }
}
