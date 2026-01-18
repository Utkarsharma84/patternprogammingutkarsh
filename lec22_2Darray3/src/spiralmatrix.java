import java.util.Scanner;

public class spiralmatrix {
    static void printmatrix(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiral(int[][] matrix,int r,int c) {
        int toprow = 0, leftcol = 0, bottemrow = r - 1, rightcol = c - 1;
        int totalelements = 0;

        while (totalelements < r * c) {
            //toprow == leftcol - rightcol
            for (int j = leftcol; j <= rightcol && totalelements < r * c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            // rightcol=toprow-bottemrow
            for (int j = toprow; j <= bottemrow && totalelements < r * c; j++) {
                System.out.print(matrix[j][rightcol]+" ");
                totalelements++;
            }
            rightcol--;
            //bottemrow=rightcol-leftcol
            for (int i = rightcol; i >= leftcol && totalelements < r * c; i--) {
                System.out.print(matrix[bottemrow][i]+" ");
                totalelements++;
            }
            bottemrow--;
            //leftcol=bottemrow-toprow
            for (int j = bottemrow; j >= toprow && totalelements < r * c; j--) {
                System.out.print(matrix[j][leftcol]+" ");
                totalelements++;
            }
            leftcol++;

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

        System.out.println("spiral matrix");
        spiral(matrix,r,c);
    }
}
