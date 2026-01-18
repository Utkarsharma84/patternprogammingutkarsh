import java.util.Scanner;

public class rotatematrix {
    static void printmatrix(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void tranposeinplace(int[][]mat,int r,int c){
        for (int i =0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    static void reversemat(int[] arr){
      int i=0, j=arr.length-1;
      while(i<j){
         int temp= arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
      }
    }

    static void rotate(int [][]matrix,int n){
        //transpose matrix
        tranposeinplace(matrix,n,n);

        //reverse each row of transepose matrix
        for (int i=0;i<n;i++){
            reversemat(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows and coloums of matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();

        int [][]matrix = new int [r][c];
        int totalements=r*c;
        System.out.println("enter "+totalements+"elements");
        for (int i =0;i<c;i++){
            for (int j=0;j<r;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("input matrix");
        printmatrix(matrix);

        System.out.println("rotate matrix");
        rotate(matrix,r);
        printmatrix(matrix);
    }
}
