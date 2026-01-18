import java.util.ArrayList;

public class returnssq {
    static ArrayList<String> getssq(String s ){
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length()==0){
            ans.add("");
            return ans;
        }

        //recursive work
        char curr = s.charAt(0); //a
        ArrayList<String> smallans=getssq(s.substring(1)); //["bc","b","c",""]


        //selfwork
        //smallans=["bc","b","c",""]
        // ans=["bc","abc","b","ab","c","ac","","a"] according to this loop
          for (String ss : smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
  return ans;
    }
    public static void main(String[] args) {
   ArrayList<String> ans = getssq("abc");
       for (String ss :ans){
       System.out.println(ss);
       }
    }
}
