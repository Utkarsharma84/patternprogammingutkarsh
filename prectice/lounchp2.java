public class lounchp2 {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < n; i++) {
//u
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
//T
                for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//k
            for (int j = 0; j < n; j++) {
                if (j == 0 || i+j == (n - 1) / 2 || i-j == (n - 1)/ 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
// A
            for (int j = 0; j < n; j++) {
               // if (j == 0 && i > 0 || j == n - 1 && i > 0 || i == 0 && j > 0 && j < n - 1 || i == (n - 1) / 2) {
                if (j==n-1&&i>(n-1)/2||j==0&&i>(n-1)/2||j-i==(n-1)/2||i+j==(n-1)/2||i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
//R
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==(n-1)/2||j==n-1&&i<(n-1)/2||i-j==(n-1)/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

//// B
//            for (int j = 0; j < n; j++) {
//                if (j == 0 || i == 0 && j < n - 1 || i == (n - 1) / 2 && j != n - 1 || i == n - 1 && j < n - 1 || j == n - 1 && i > 0 && i != (n - 1) / 2 && i < n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.print("  ");
//s
                for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0&&i<(n-1)/2||i==(n-1)/2||i==n-1||j==n-1&&i>(n-1)/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
//H
            for (int j = 0; j < n; j++) {
                if (j == 0 ||j==n-1||i==(n-1)/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
//x
            for(int j = 0; j<n;j++){
                if (i==j||i+j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

// [x]
            for(int j = 0; j<n;j++){
                if (i==j||i+j==n-1||i==0|j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for(int j = 0; j<n;j++){
                if (j-i==(n-1)/2||i+j==(n-1)/2||i-j==(n-1)/2||i+j==(n-1)+(n-1)/2||i==j||i+j==n-1||i==0|j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for(int j = 0; j<n;j++){
                if (j-i==(n-1)/2||i+j==(n-1)/2||i==(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for(int j = 0; j<n;j++){
                if (j-i==(n-1)/2||i+j==(n-1)/2||i-j==(n-1)/2||i+j==3*(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");



            System.out.println();

    }

}
}
