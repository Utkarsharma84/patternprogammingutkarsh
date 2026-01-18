import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class findallndices {//same as findindices but in arraylist
    static ArrayList<Integer>allindices(int a[],int target,int idx){
        ArrayList<Integer> ans= new ArrayList<>();

        // base case

        if (idx>=a.length){
            return ans;
        }

        // self work
        if (a[idx]==target){
            ans.add(idx);
        }

         // recursive work
        ArrayList<Integer> smallans=allindices(a,target,idx+1);
        ans.addAll(smallans);
        return ans;

    }
    public static void main(String[] args) {
        int []a={1,2,3,2,2,5};
        int target =2;

        ArrayList<Integer>ans=allindices(a,target,0);
        for (int i:ans){
            System.out.println(i);
        }

    }
}
