import com.sun.source.doctree.SpecTree;

public class prntarr {
    static int maxx(int[] arr,int idx){
        if (idx==arr.length)return idx;
         int smallans = maxx(arr,idx+1);
         return Math.max(arr[idx],smallans);
    }

    public static void main(String[] args) {
        int[] arr= {10,2,300,4,89,90};
        System.out.println(maxx(arr,0));
    }
}
