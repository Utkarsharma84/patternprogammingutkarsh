import java.util.Scanner;

public class revspiralmatrix {
    static void printmatrix(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[] spiral(int[][] matrix,int r,int c) {
        int[] result = new int[r*c];
        int idx = 0;
        int toprow = 0, leftcol = 0, bottemrow = r - 1, rightcol = c - 1;
        int totalelements = 0;


        while (totalelements < r * c) {
            //toprow == toprow - rightcol
            for (int j = leftcol; j <= rightcol && totalelements < r * c; j++) {
//                System.out.print(matrix[toprow][j] + " ");
                result[idx++] = matrix[toprow][j];
                totalelements++;
            }
            toprow++;
            // rightcol=toprow-bottemrow
            for (int j = toprow; j <= bottemrow && totalelements < r * c; j++) {
//                System.out.print(matrix[j][rightcol]+" ");
                result[idx++] = matrix[j][rightcol];
                totalelements++;
            }
            rightcol--;
            //bottemrow=rightcol-leftcol
            for (int i = rightcol; i >= leftcol && totalelements < r * c; i--) {
//                System.out.print(matrix[bottemrow][i]+" ");
                result[idx++] = matrix[bottemrow][i];
                totalelements++;
            }
            bottemrow--;
            //leftcol=bottemrow-toprow
            for (int j = bottemrow; j >= toprow && totalelements < r * c; j--) {
//                System.out.print(matrix[j][leftcol]+" ");
                result[idx++] = matrix[j][leftcol];
                totalelements++;
            }
            leftcol++;

        }
        return result;
    }
//        static int[][] reversemat(int arr[][],int n){
//
//        for (int i =arr.length-1;i>=arr[0].length;i--){
//          arr =  spiral(arr,n,n);
//        }
//        return arr ;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and coloums of matrix");
//        int r=sc.nextInt();
//        int c=sc.nextInt();

//        int [][]matrix=new int[r][c];
//        int totalelements = r*c;
//        System.out.println("enter "+totalelements+"elements of array");
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }

        int r = 3;
        int c = 3;
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("input matrix");
        printmatrix(matrix);

        int[] result = spiral(matrix, r, c);
        // System.out.println(Arrays.toString(result));
        for(int i = result.length-1; i >= 0; i--) System.out.print(result[i] + " ");
    }
}
        /*  1 2 3 4
            5 6 7 8
            9 10 11 12
            13 14 15 16   */