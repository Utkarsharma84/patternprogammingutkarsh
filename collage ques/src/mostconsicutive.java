import java.util.HashSet;

public class mostconsicutive {
     static int consicutive(int[] arr){
         int min= Integer.MAX_VALUE;
         int max = 0;
         int curr = 0;
         int streak = 0;
         HashSet<Integer> set = new HashSet<>();

         for(int i : arr){
             set.add(i);
             max = Math.max(max, i);
             min = Math.min(min, i);
         }

         for(int i = min; i <= max; i++){
             if(set.contains(i-1)){
                 curr++;
                 streak = Math.max(streak, curr);
             }
             else curr = 1;
         }
         return streak;
     }
    public static void main(String[] args) {
        int[] arr= {100,4,200,3,2,1};
        System.out.println(consicutive(arr));
    }
}
