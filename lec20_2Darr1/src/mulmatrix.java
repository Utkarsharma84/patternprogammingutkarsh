import java.util.Scanner;

public class mulmatrix {
    static void printmatrix(int [][]matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // <-- print newline after each row
        }
    }

    static void multiply(int [][]a,int r1,int c1,int[][]b,int r2,int c2){
        if (c1!=r2){
            System.out.println("wrong dimention :- multiplication not possible ");
            return;
        }
        int mul[][]=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    //i=1,j=0
                    //mul[i][j]=ith row of a * jth coloum of b;
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("multiplication of 2 matrices");
        printmatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and coloums of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("enter matrix values");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter number of rows and coloums of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("enter matrix values");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println("print matrix 1");
        printmatrix(a);
        System.out.println("print matrix 2");
        printmatrix(b);

        multiply(a,r1,c1,b,r2,c2);

    }
}
/*
enter number of rows and coloums of matrix 1
2 3
enter matrix values
1 2 3
1 2 3
enter number of rows and coloums of matrix 2
3 3
enter matrix values
1 2 3
1 2 3
1 2 3
print matrix 1
1 2 3
1 2 3
print matrix 2
1 2 3
1 2 3
1 2 3
multiplication of 2 matrices
6 12 18
6 12 18
 */