import java.util.Scanner;

public class findmin {
    static int SmallestNum(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int secondsmallest(int arr[]) {
        int min = SmallestNum(arr);
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min&&arr[i] < max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("smallest num is : " + SmallestNum(arr));
        int second = secondsmallest(arr);
        System.out.println("second smallest num is :" + second);
    }
}