public class largestbestapproach {
     static int secondLarges(int[] arr) {
        int first = Integer.MIN_VALUE;   // largest
        int second = Integer.MIN_VALUE;  // second largest

        for (int num : arr) {
            if (num > first) {
                second = first;  // update second largest
                first = num;     // update largest
            } else if (num > second && num < first) {
                second = num;    // update only second largest
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr= {4,5,6,7,8,4 ,5 ,8,5};
        System.out.println(secondLarges(arr));
    }

}
