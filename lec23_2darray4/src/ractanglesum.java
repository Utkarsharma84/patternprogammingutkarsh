import java.util.Scanner;

public class ractanglesum {
    static int findsum(int matrix[][],int l1,int r1,int l2,int r2){
        int summ =0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                summ+=matrix[i][j];
            }
        }
        return summ;
    }
    // find row wise and coloum wise prefixsum of array
    static void prefixsummatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // travers horizontally to make row wise  prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // travers vertically to make coloum wise  prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }
//    static void prefixsummatrixx(int[][] matrix) {
//        int r = matrix.length;
//        int c = matrix[0].length;
//        // travers horizontally to make row wise  prefix sum
//        for (int i = 0; i < r; i++) {
//            for (int j = 1; j < c; j++) {
//                matrix[i][j] += matrix[i][j - 1];
//            }
//        }
//    }
//        static int findsum2 ( int matrix[][], int l1, int r1, int l2, int r2){
//            int summm = 0;
//            prefixsummatrixx(matrix);
//            for (int i=l1;i<=l2;i++){
//                // r1 to r2 sum for row i
//                if (r1>=1)
//                summm+=matrix[i][r2]-matrix[i][r1-1];
//                else summm+=matrix[i][r2];
//            }
//            return summm;
//        }
        static int findsum3 ( int[][] matrix, int l1, int r1, int l2, int r2){
            int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
            prefixsummatrix(matrix);
            sum = matrix[l2][r2];
            if (l1 >= 1)
                up = matrix[l1 - 1][r2];
            if (r1 >= 1)
                left = matrix[l2][r1 - 1];
            if (l1 >= 1 && r1 >= 1)
                leftup = matrix[l1 - 1][r1 - 1];
            ans = sum - up - left + leftup;
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows and coloum of matrix");
        int r =sc.nextInt();
        int c = sc.nextInt();
        int totalsum=r*c;
        int matrix[][]=new int[r][c];
        System.out.println("enter "+totalsum+"values");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
            System.out.println("enter boundris for rectangle sum");
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2 =sc.nextInt();

//      System.out.println("recterngle sum is : "+findsum(matrix, l1,r1,l2,r2));
//        System.out.println("recterngle sum is : "+findsum2(matrix, l1,r1,l2,r2));
        System.out.println("recterngle sum is : "+findsum3(matrix, l1,r1,l2,r2));
        }
    }

