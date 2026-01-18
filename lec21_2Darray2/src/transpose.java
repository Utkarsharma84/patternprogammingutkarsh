import java.util.Scanner;

public class transpose {
    static void printmatrix(int[][]matrix){
        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

//    static int[][] findtranspose(int [][]matrix,int r,int c){
//        int ans [][]=new int[c][r];
//        for (int i =0;i<c;i++){
//            for (int j=0;j<r;j++){
//                ans[i][j]=matrix[j][i];
//
//            }
//        }
//        return ans;
//    }

    static void findtransposeinplace(int [][]matrix,int r,int c){

        for (int i =0;i<c;i++){
//            for (int j=0;j<r;j++)
            for (int j=i;j<r;j++){
               int temp = matrix[i][j];
               matrix [i][j]=matrix[j][i];
               matrix[j][i]=temp;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows and coloums of matrix 1");
        int r =sc.nextInt();
        int c=sc.nextInt();
        int matrix [][]=new int[r][c];
        int totalelements =r*c;
        System.out.println("enter "+totalelements+"elements");
        for (int i =0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("intput matrix");
        printmatrix(matrix);

        System.out.println("transpose of matrix");
       findtransposeinplace(matrix,r,c);
       printmatrix(matrix);

    }
}
