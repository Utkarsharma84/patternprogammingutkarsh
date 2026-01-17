import java.util.Scanner;


public class mult {

    static void printmatrix(int [][]matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // <-- print newline after each row
        }
    }
    static void multi(int[][] a, int r1, int c1, int[][] b, int r2, int c2){


        if (c1!=r2){
            System.out.println("multiplication not possible-wrong dimention");
            return;
        }
        int[][] mul = new int[r1][c2];

        for (int i=0;i<r1;i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printmatrix(mul);

    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("enter row and coloum of a matrix1");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int[][] a = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("enter row and coloum of a matrix2");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] b = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

        System.out.println("multiplication is ");
         multi(a,r1,c1,b,r2,c2);


    }
}
