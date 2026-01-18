import java.util.Scanner;

public class genratematrix {
    static void printmatrix(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] genratespiralmatrx(int n ){
        int matrix[][]=new int[n][n];
        int toprow=0,bottemrow=n-1,rightcol=n-1,leftcol=0;
        int curr=1;
        while(curr<=n*n){
            // toprow= lefrtcol-rightcol;
            for (int j=leftcol;j<=rightcol&&curr<=n*n;j++){
                matrix[toprow][j]=curr++;
            }toprow++;

            // rightcol=toprow to bottemrow
            for (int i =toprow;i<=bottemrow&&curr<=n*n;i++){
                matrix[i][rightcol]=curr++;
            }rightcol--;

            // bottemrow= rightcol to leftcol
            for (int j=rightcol;j>=leftcol&&curr<=n*n;j--){
                matrix[bottemrow][j]=curr++;
            }bottemrow--;

            // leftcol= bottemrow to toprow
            for (int i =bottemrow;i>=toprow&&curr<=n*n;i--){
                matrix[i][leftcol]=curr++;
            }leftcol++;

        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n =sc.nextInt();

        int [][]matrix=genratespiralmatrx(n);
        printmatrix(matrix);

    }
}
