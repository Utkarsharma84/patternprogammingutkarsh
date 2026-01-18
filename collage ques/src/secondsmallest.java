public class secondsmallest {
    static int secondsmallest(int[]arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int nums : arr){
              if (nums<first){
                  second=first;
                  first=nums;
              }
              if (nums<first&&nums<second){
                  second=first;
              }
        }
        return second;
    }

    public static void main(String[] args) {
        int [] arr= {1,0,2,3,4,5};
        System.out.println(secondsmallest(arr));
    }
}
